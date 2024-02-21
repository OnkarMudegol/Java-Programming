class A{
    A()
    {
        System.out.println("a");
    }
}
class B extends A{
    B()
    {
        System.out.println("b");
    }
}
class C extends B{
    C()
    {
        System.out.println("c");
    }
}
public class multilevelInheritance
{
    public static void main(String args[])
    {
        C obj = new C();
    }
}