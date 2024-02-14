import java.util.Scanner;
public class floatType
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        float num1= 9.98f;
        if(num==num1)
        {
            System.out.println("Bingo!!");
        }
        else
        {
            System.out.println("Try again!");
        }
    }
}