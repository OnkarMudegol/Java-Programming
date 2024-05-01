// the hash function generates a key and then according to the key we store the element in the hashmap
// Stored in the form of <Key, Value>
//We can search the element based on the key also and the value also
//The key value has to be unique, otherwise the element at that key(which was added earlier) will be replaced
//In value we can add any number of nulls, but in key we can only add one null value
import java.util.*;
public class hashMap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<Integer,String>();
        System.out.print("Enter the number of elements to add: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Enter the value to be stored at "+(i+1)+" key value: ");
            String ele = sc.nextLine();
            map.put(i+1,ele);
        }
        System.out.println("The HashMap is as follows: ");
        for(Map.Entry m : map.entrySet())
        {
            System.out.println("The vakue at key "+m.getKey()+" is "+m.getValue());
        }
        //Key based removal
        System.out.print("Enter the key value to be removed: ");
        int remKey = sc.nextInt();
        map.remove(remKey);
        sc.nextLine();
        System.out.println("The updated HashMap is: "+map);
        System.out.println("The updated HashMap is: "+map);
        //Pair based removal
        System.out.print("Enter the key to be removed: ");
        remKey = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the value to be removed: ");
        remVal = sc.nextLine();
        map.remove(remKey, remVal);
        System.out.println("The updated HashMap is: "+map);
        System.out.println("The size of the HashMap is: "+map.size());
    }
}