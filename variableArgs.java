public class variableArgs{
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
}