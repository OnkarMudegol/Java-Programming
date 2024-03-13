//Here we are decalring the inner class inside a function of the outer class
class Outer
{
    void outerMethod()
    {
        System.out.println("Outer Method");
        class Inner
        {
            void innerMethod()
            {
                System.out.println("Inner Method");
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}
//No need to create a inner class object or call the inner class function as it is getting created when the outer class method is called.
class methodDeclaration
{
    public static void main(String args[])
    {
        Outer obj = new Outer();
        obj.outerMethod();
    }
}