/*public class variableArgs{
    static void fun(int...a)
    {
        System.out.println("Number of arguments: "+a.length);
        //using for each loop to display contents of a
        for(int i:a)
        {
            System.out.println(i+" ");
            System.out.println();
        }
    }
        public static void main(String args[])
        {
            fun(100);
            fun(1,2,3);
            fun();
        }
}*/

public class variableArgs{
    static void fun(String str,int...a)
    {
        System.out.println("String: "+str);
        System.out.println("Number of arguments: "+a.length);
        for(int i:a)
        {
            System.out.print(i+" ");
            System.out.println();
        }
    }
    public static void main(String args[]) 
    {
        fun("LPU",100);
        fun("Hello",1,2,3,4);
        fun("World");
    }
}