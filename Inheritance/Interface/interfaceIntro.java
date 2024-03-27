// Not necessary but helps you find the error in case your interface does not follow the rules
//SAM - Single Abstract Method; Functional interface is a interface containing a single abstract method, can conatin any number of other methods, doesnt matter
@FunctionalInterface
interface API
{
    //default method - this method can be overrriden in derived classes, but provides a base case 
    default void show()
    {
        System.out.println("Default API.");
    }
}
interface Interface1 extends API
{
    void display();
}
interface  Interface2 extends API
{
    void print();
}
class interfaceIntro implements Interface1, Interface2{
    public void display()
    {
        System.out.println("Display from interface1");
    }
    public void print()
    {
        System.out.println("Display from interface2");
    }
    public static void main(String args[])
    {
        interfaceIntro I = new interfaceIntro();
        I.show();//calls the default implementation of show
        I.display();//calls the specific implementation of display
        I.print();
    }
}