//We get the current date in the format of yyyy/mm/dd
import java.time.LocalDate;
public class date
{
    public static void main(String args[])
    {
        LocalDate Obj = LocalDate.now();
        System.out.println(Obj);
    }
}