//Some important points:
// 1.An Abstract class can have abstract as well as no-abstract methods
// 2.An Abstract class can also have Final and Static methods
// 3.When craeting an object, we craete it according to the memory of the derived class.
//   e.g. Base  b = new Derived();

abstract class A
{
    A()
    {
        System.out.println("COnstructor of A");
    }
    abstract void display();
    void C()
    {
        System.out.println("Non abstract member function of abstrct class A");
    }
    final void Final()
    //This is the final definition, it cannot be overwritten in member classes
    {
        System.out.println("Final funtion of abstract class A");
    }
    static void stat()  //Can be called directy without creating a object of A
    {
        System.out.println("Static memenr funtion of the abstrct class A");
    }
}
class B extends A 
{
    B()
    {
        System.out.println("Constructor of B");
    }
    void display()
    {
        System.out.println("Viewing class B");
    }
}
class C extends A 
{
    C()
    {
        System.out.println("Constructor of C");
    }
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
        a.C();
        A b = new C();
        b.display();
        b.Final();
        A.stat(); //Called without craeting a object, dierct approach

    }
}