import java.io.FileInputStream;
class readingFile{
    public static void main(String arg[])
    {
        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\omude\\OneDrive\\Desktop\\Java-Programming\\COPYRIGHT.txt");
            int i = fin.read();
            System.out.println((char)i);
            fin.close();
            System.out.println("Sucess");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}