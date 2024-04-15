import java.io.*;
public class serializationIntro implements Serializable{
    public String stu_Name, stu_Addr;
    public int stu_Id;
    public static void main(String arg[]){
        serializationIntro s = new serializationIntro();
        s.stu_Name="John Doe";
        s.stu_Addr="123 ABC Street";
        s.stu_Id=15;
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