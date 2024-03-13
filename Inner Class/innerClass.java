//This concept is majorly used for encapsulation. Helps group all the related classes in one place.
class Outer
{
    class Inner
    {
        public void show()
        {
            System.out.println("In a nested class method.");
        }
    }
}
class innerClass
{
    public static void main(String args[])
    {
        Outer.Inner obj = new Outer().new Inner();
        obj.show();
    }    
}