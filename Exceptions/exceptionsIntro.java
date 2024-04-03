//Exceptions are of two types, checked and unchecked
//Arithematic exceptions are unchceked exceptions, which means the program will be compiled, exception will be thrown at run time
//Checked excceptions are the exceptions about which the compiler will alert us wile compiling. Unchecked are the ones which the compiler does'nt know about. 
//Note: Both exceptions will occur at run time, it is just that the compiler warns us about the  potential problem in checked exceptions
public class exceptionsIntro
{
    public static void main(String args[])
    {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println(100/0);
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
    }
}