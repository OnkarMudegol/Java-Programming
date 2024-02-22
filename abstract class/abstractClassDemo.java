//Create a abstrct class named Bank, which contains abstrct memener function getRateOfInterest with return type int. Create two new classes as SBI and PNB which will inherit Bank ans return 7 and 8 as rate of interest repectively
import java.util.Scanner;
abstract class Bank
{
    abstract int rateOfInterest();
}
class SBI extends Bank{
    int rateOfInterest()
    {
        return 7;
    }
}
class PNB extends Bank{
    int rateOfInterest()
    {
        return 8;
    }
}
public class abstractClassDemo
{
    public static void main(String args[])
    {
        Bank Bank1;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your bank of choice (SBI/PNB): ");
            String input  = sc.nextLine();
            System.out.println("Choosen bank is "+input);
            switch (input){
                case "SBI":
                    Bank1=new SBI();
                    System.out.println("Rate of interest is "+Bank1.rateOfInterest());
                    break;
                case "PNB":
                    Bank1 = new PNB();
                    System.out.println("Rate of interest is "+Bank1.rateOfInterest());
                    break;
                default:
                    System.out.println("Invalid input. Please enetr from the given two options.");
                    return;
            }
        }while(true);
    }
}
