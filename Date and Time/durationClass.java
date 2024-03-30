import java.time.*;
public class durationClass
{
    public static void main(String args[]){
    
        Duration d = Duration.between(LocalTime.NOON, LocalTime.MIDNIGHT);
        System.out.println(d.getSeconds());
        System.out.println(d.toMinutes());
        System.out.println(d.toHours());
        int minutesToAdd = 30;
        //Adding time
        LocalTime nm  = LocalTime.NOON.plusMinutes(minutesToAdd);
        System.out.println(nm);
    }
}