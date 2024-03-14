//WAP to implement a expression to filter out even and odd numbers form a list of integers using lambda expression in java
interface Function
{
    public void evenOrOdd(int num);
}
public class lambdaExpression_Demo
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Function f = (num) ->{
            if(num%2==0)
            {
                System.out.println(num+" ");
            }
        };
        for(int num:arr)
        {
            f.evenOrOdd(num);
        }
    }

}