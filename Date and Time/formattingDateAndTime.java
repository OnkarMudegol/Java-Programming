import java.time.LocalDateTime;
//This is a special class used to format date and time.
import java.time.format.DateTimeFormatter;
public class formattingDateAndTime
{
    public static void main(String args[])
    {
        LocalDateTime Obj = LocalDateTime.now();
        System.out.println("Before formatting: "+Obj);
        DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("E, dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter formatter_2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter_3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatter_4 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        DateTimeFormatter formatter_5 = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String formatted_1 = Obj.format(formatter_1);
        String formatted_2 = Obj.format(formatter_2);
        String formatted_3 = Obj.format(formatter_3);
        String formatted_4 = Obj.format(formatter_4);
        String formatted_5 = Obj.format(formatter_5);
        System.out.println("After formatting: ");
        System.out.println(formatted_1);
        System.out.println(formatted_2);
        System.out.println(formatted_3);
        System.out.println(formatted_4);
        System.out.println(formatted_5);
    }
}
//Note: 
// 1.Make sure MM shoud be always capital, otherwise repeats the month number even if single digit, e.g. , March - 03; gives out 33;
// 2.Other should be small, otherwise give out wrong values
//Various formats:
// yyyy-MM-dd      "1998-09-29"
// dd/MM/yyyy      "29/09/1998"
// dd-MMM-yyyy     "29-Sep-1998"
// E, MMM dd yyyy  "Thu, Sep 29 1998"