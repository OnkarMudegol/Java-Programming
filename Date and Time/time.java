//We get the time in hh:mm:ss:nano seconds
import java.time.LocalTime;
public class time
{
    public static void main(String args[])
    {
        LocalTime Obj = LocalTime.now();
        System.out.println(Obj);
    }
}