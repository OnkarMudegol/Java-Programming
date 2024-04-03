//The program terminates after the execution of the catch block
import java.io.FileInputStream;
public class exceptionHandling
{
    public static void main(String args[])
	{
        try{
            FileInputStream abc = new FileInputStream("C:/Users/omude/OneDrive/Desktop/Java -Programming/xtz.txt");
        }
        catch(Exception e)
        {
            System.out.println("Check if the file exists or not!!");
        }
		
	}
}