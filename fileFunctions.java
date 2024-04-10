import java.io.File;
class fileFunctions
{
    static void p(String s)
    {
        System.out.println(s);
    }
    public static void main(String arg[])
    {
        File f1 = new File("C:\\Users\\omude\\OneDrive\\Desktop\\Java-Programming\\COPYRIGHT.txt");
        System.out.println("File Name: "+f1.getName());
        System.out.println("Path: "+f1.getPath());
        System.out.println("Abs Path: "+f1.getAbsolutePath());
        System.out.println("Parent: "+f1.getParent());
        System.out.println(f1.exists()?"Exists":"Does not Exists");
        System.out.println(f1.canWrite()?"is writable":"is not writable");
        System.out.println(f1.canRead()?"is readable":"is not readable");
        System.out.println("Is "+(f1.isDirectory()?"a ":"not a ")+"directory");
        System.out.println(f1.isFile()?"is normal file":"might be a named pipe");
        System.out.println(f1.isAbsolute()?"is absolute":"is not absoulte");
        System.out.println("File last modefied: "+f1.lastModified());
        System.out.println("File size: "+f1.length()+" Bytes");
    }
}