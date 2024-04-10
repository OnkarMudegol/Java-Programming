import java.io.FileOutputStream;
class writingFile{
    public static void main(String arg[])
    {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\omude\\OneDrive\\Desktop\\Java-Programming\\COPYRIGHT.txt");
            String s = "Hello World!";  //Declare a string
            byte b[] = s.getBytes(); //converts string into byte array
            fout.write(b);
            fout.close();
            System.out.println("Sucess");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}