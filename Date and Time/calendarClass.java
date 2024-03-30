import java.util.*;
public class calendarClass{
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.getTimeZone());

        //To get the maximum and minimum values
        System.out.println(c.getMaximum(Calendar.DAY_OF_WEEK));
        System.out.println(c.getMinimum(Calendar.WEEK_OF_YEAR));

        //Adding 
        c.add(Calendar.DATE, 6);
        System.out.println(c.getTime());
        c.add(Calendar.MONTH, 6);
        System.out.println(c.getTime());
        c.add(Calendar.YEAR, 6);
        System.out.println(c.getTime());
    }
}