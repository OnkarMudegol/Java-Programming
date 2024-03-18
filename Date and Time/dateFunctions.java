//How many years have passed since the last football world cup?
//When we want specific parts from the format we use the get functions, e.g, getYear, getMonth, getDate.
import java.time.*;
public class dateFunctions
{
    public static void main(String args[])
    {
        LocalDate today = LocalDate.now();
        LocalDate worldCupDate = LocalDate.of(2022,12,18);
        //18th of December 2022, but to put in the same format as that of now function we use .of
        int years = today.getYear() - worldCupDate.getYear();
        Period period = Period.between(today, worldCupDate);
        System.out.println("The number of years since last world cup: "+years);
        //We can also use the period function
        System.out.println("The number of years since last world cup: "+period);

        //Incrementing od decrementing dates
        System.out.println("Incrementing years: "+today.plusYears(1));
        System.out.println("Incrementing months: "+today.plusMonths(1));
        System.out.println("Incrementing days: "+today.plusDays(1));
        System.out.println();
        System.out.println("Decrementing years: "+today.minusYears(1));
        System.out.println("Decrementing months: "+today.minusMonths(1));
        System.out.println("Decrementing days: "+today.minusDays(1));
    }
}