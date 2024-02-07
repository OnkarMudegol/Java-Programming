public class intializerBlock{
//Intializer block, position does not matter
{
    System.out.println("Common part of every concstructor invoked!");
}
public intializerBlock()
{
    System.out.println("Default Constructor invoked!!");
}
public intializerBlock(int x)
{
    System.out.println("Parameterized Constructor invoked!!");
}
public static void main(String args[])
{
    intializerBlock obj1, obj2;
    obj1 = new intializerBlock();
    obj2 = new intializerBlock(0);
}
}