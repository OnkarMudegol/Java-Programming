//WAP to implement a lambda expression to concatenate two strings
interface Function
{
    public String Concat(String st1, String st2);
}
public class lambdaExpression_Demo2
{
    public static void main(String args[])
    {
        String s1 = "Hello";
        String s2 = " World";
        Function f = (a,b)->{
            return a+b;
        };
        System.out.println(f.Concat(s1,s2));
    }
}
