import java.util.*;
public class stackImplementation{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of stack: ");
        int n = sc.nextInt();
        Deque<Integer> deque= new ArrayDeque<Integer>();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the "+(i+1)+"th element: ");
            int p = sc.nextInt();
            deque.offerFirst(p);
        }
        System.out.println("The Stack is as follows: ");
        System.out.print(deque);
    }
}