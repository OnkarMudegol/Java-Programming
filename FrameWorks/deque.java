//to implement queue (FIFO) and to implement stack (LIFO) we use the various similar functions provided in this interface 
import java.util.*;
public class deque{
    public static void main(String args[]){
        Deque<String> deque = new ArrayDeque<String>();
        //adds elemnts at the end 
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        System.out.println(deque);
        for(String str: deque){
            System.out.println(str);
        }
        //adds element at the end
        deque.offer("arvind");
        System.out.println(deque);
        deque.offer("vimal");
        System.out.println(deque);
        //adds element at the start
        deque.offerFirst("jai");
        System.out.println(deque);
        //adds the element at the end
        deque.offerLast("amar");
        System.out.println(deque);
        //Removes the head or returns if the queue is empty
        deque.pollFirst();  // poll() and pollFirst() are the same thing
        System.out.println(deque);
        //Removes the last elements 
        deque.pollLast(); 
        System.out.println(deque);
        
    }
}