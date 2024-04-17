//To ignore some value, use transient, it will not save the content of that data member
//If you make something static during serialization, it will change, give out any value
import java.io.*;
import java.util.*;
public class serializationIntro implements Serializable{
    public String stu_Name, stu_Addr;
    transient String stu_BloodGrp;
    public int stu_Id;
    static int stu_Age;
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        serializationIntro s = new serializationIntro();
        System.out.print("Enter student name: ");
        s.stu_Name=sc.nextLine();
        System.out.print("Enter Address: ");
        s.stu_Addr=sc.nextLine();
        System.out.print("Enter student blood group: ");
        s.stu_BloodGrp=sc.nextLine();
        System.out.print("Enter student Id: ");
        s.stu_Id=sc.nextInt();
        System.out.print("Enter student age: ");
        s.stu_Age = sc.nextInt();
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