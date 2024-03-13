//This concept is majorly used for encapsulation. Helps group all the related classes in one place.
// class Outer
// {
//     class Inner
//     {
//         public void show()
//         {
//             System.out.println("In a nested class method.");
//         }
//     }
// }
// class innerClass
// {
//     public static void main(String args[])
//     {
//         Outer.Inner obj = new Outer().new Inner();
//         obj.show();
//     }    
// }


//Another way to create variables 
class Outer{
    private int data=30;
    void msg1()
    {
        System.out.println("In Outer class.");
    }
    class Inner{
        void msg()
        {
            System.out.println("The value of data is: "+data);
        }
    }
}
class innerClass
{
    public static void main(String args[])
    {
        Outer obj = new Outer();
        Outer.Inner obj2 = new Outer().new Inner();
        obj.msg1();
        obj2.msg();
    }
}