import java.time.LocalDateTime;
//This is a special class used to format date and time.
import java.time.format.DateTimeFormatter;
public class formattingDateAndTime
{
    public static void main(String args[])
    {
        LocalDateTime Obj = LocalDateTime.now();
        System.out.println("Before formatting: "+Obj);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd-MM-yyyy HH:mm:ss");
        String formatted = Obj.format(formatter);
        System.out.println("After formatting: "+formatted);
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