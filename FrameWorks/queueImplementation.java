import java.util.*;
public class queueImplementation{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of queue: ");
        int n = sc.nextInt();
        Deque<Integer> deque= new ArrayDeque<Integer>();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the "+(i+1)+"th element: ");
            int p = sc.nextInt();
            deque.offerLast(p);
        }
        System.out.println("The Queue is as follows: ");
        System.out.println(deque);
    }
}