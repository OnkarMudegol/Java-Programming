//To acess the variables that are decalred inside the Outer class
class Outer
{
    void outerMethod()
    {
        int x = 98;
        System.out.println("Inside Outer Method");
    class Inner
    {
        void innerMethod()
        {
            System.out.println("x= "+x);
        }
    }
    Inner y = new Inner();
    y.innerMethod();
    }
}
class variableAcess
{
    public static void main(String args[])
    {
        Outer obj = new Outer();
        obj.outerMethod();
    }
}