abstract class A
{
    abstract void display();
}
class B extends A 
{
    void display()
    {
        System.out.println("Viewing class B");
    }
}
class C extends A 
{
    void display()
    {
        System.out.println("Viewing class C");
    }
}
public class abstractClass
{
    public static void main(String args[])
    {
        A a = new B();
        a.display();
        A b = new C();
        b.display();
    }
}