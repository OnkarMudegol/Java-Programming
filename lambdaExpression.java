//write a simple java program to illustrate the usage of lambda expression
//given an array of numbers, print each number along with its square.
import java.util.*;
public class LambdaExpression {
    public static void main(String[] args)  
    {   
        int arr[] = new int[]{10, 25, 36};
        
        Arrays.stream(arr).forEach((x) -> System.out.println("Number: " + x + ", Square: " + (x*x)));
    }    
}
interface Addable
{
    int add(int a, int b);
}
public class LambdaExpression
{
    public static void main(String args[])
    {
        Addable ad1 = (a,b) -> a+b;
        System.out.println(ad1.add(10,10));
    }
}