import java.util.*;
class treeSet{
    public static void main(String args[]){
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(50);
        set.add(40);
        set.add(10);
        set.add(30);
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}