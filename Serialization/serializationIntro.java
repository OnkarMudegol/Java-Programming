//To ignore some value, use transient, it will not save the content of that data member
//If you make something static during serialization, it will change, give out any value
import java.io.*;
public class serializationIntro implements Serializable{
    public String stu_Name, stu_Addr;
    transient int stu_BloodGrp;
    public int stu_Id;
    static int stu_Age;
    public static void main(String arg[]){
        serializationIntro s = new serializationIntro();
        s.stu_Name="John Doe";
        s.stu_Addr="123 ABC Street";
        s.stu_Id=15;
        s.stu_BloodGrp='A';
        s.stu_Age = 21;
        try{
            FileOutputStream fileout = new FileOutputStream("C:\\Users\\omude\\OneDrive\\Desktop\\Java-Programming\\Serialization\\serializationIntro.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(s);
            out.close();
            fileout.close();
            System.out.println("Object serialized and saved in serializationIntro.txt ");
        }catch(IOException i){
                i.printStackTrace();
        }
    }
}