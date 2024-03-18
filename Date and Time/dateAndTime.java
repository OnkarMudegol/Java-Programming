//There is a capital T in the output. It is to seperate the date and time. Rest in same format.
import java.time.LocalDateTime;
public class dateAndTime
{
    public static void main(String args[])
    {
        LocalDateTime Obj = LocalDateTime.now();
        System.out.println(Obj);
    }
}