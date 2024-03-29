//Not craeting a class explicitly, but rather at run time depending on the need.
//Only an outline is defined first, then the full defination is given at run time.
//Functions defined at runtime are defined there only, not mapped to earlier decalration.

//The following is just a template, the functions are not defined
abstract class Person
{
    abstract void eat();
}
class anonymousClass
{
    public static void main(String args[])
    {
        Person p = new Person()
        {
            //This function is defined just here, not in the above declaration.
            //Can create a new object p2 and define again.
            void eat()
            {
                System.out.println("Anonymous class creation.");
            };
        };
        p.eat();
    }
}

interface Drawable
{
    public void draw();
}
public class anonymousClass
{
    pubic static void main(String args[])
    {
        int width = 10;
        Drawable d = mew Drawable()
        {
            public void draw()
            {
                System.out.println("Drawing: "+width);
            };
        }
        d.draw();
    }
}