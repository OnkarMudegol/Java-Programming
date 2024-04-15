import java.io.*;
public class deserializationIntro implements Serializable{
    public String stu_Name, stu_Addr;
    public int stu_Id;
    public static void main(String arg[]){
        serializationIntro s = null;
        try{
            FileInputStream filein = new FileInputStream("C:\\Users\\omude\\OneDrive\\Desktop\\Java-Programming\\Serialization\\serializationIntro.txt");
            ObjectInputStream in = new ObjectInputStream(filein);
            s=(serializationIntro)in.readObject();
            in.close();
            filein.close();
        }catch(IOException i){
                i.printStackTrace();
        }catch(ClassNotFoundException c){
            System.out.println("The class has not been found");
            c.printStackTrace();
            return;
        }
        System.out.println("***Deserialized Student***");
        System.out.println("Student Name : "+s.stu_Name);
        System.out.println("Student Address : "+s.stu_Addr);
        System.out.println("Student Id : "+s.stu_Id);

    }
}