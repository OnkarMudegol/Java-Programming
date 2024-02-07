public class Intializer_block{
//Intializer block, position does not matter
{
    System.out.println("Common part of every concstructor invoked!");
}
public Intializer_block()
{
    System.out.println("Default Constructor invoked!!");
}
public Intializer_block(int x)
{
    System.out.println("Parameterized Constructor invoked!!");
}
public static void main(String args[])
{
    Intializer_block obj1, obj2;
    obj1 = new Intializer_block();
    obj2 = new Intializer_block(0);
}
}