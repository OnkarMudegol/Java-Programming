//Write a java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extends the Shape and implements the respecctive methods.
import java.util.Scanner;
abstract class Shape
{
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
class Circle extends Shape
{
    Scanner sc = new Scanner(System.in);
    int radius;
    Circle()
    {
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextInt();
    }
    void calculateArea()
    {
        System.out.println("The area of the circle is: "+(Math.PI*radius*radius));
    }
    void calculatePerimeter()
    {
        System.out.println("The perimeter of the circle is: "+(Math.PI*radius*2));
    }


}
class Triangle extends Shape
{
    Scanner sc = new Scanner(System.in);
    int base, height, side1, side2;
    Triangle()
    {
        System.out.print("Enter the base of the circle: ");
        base = sc.nextInt();
        System.out.print("Enter the side1 of the circle: ");
        side1 = sc.nextInt();
        System.out.print("Enter the side2 of the circle: ");
        side2 = sc.nextInt();
        height = Math.sqrt(((side1)*(side1))-((0.5*base)*(0.5*base)));
    }
    void calculateArea()
    {
        System.out.println("The area of the traibgle is: "+(0.5*base*height));
    }
    void calculatePerimeter()
    {
        System.out.println("The perimeter of the circle is: "+(side1+side2+base));
    }

}
public class abstractClassQuestion_1
{
    public static void main(String args[])
    {
        System.out.println("1 -> Circle\n2->Triangle");
        System.out.print("Please enter a choice:");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        if(choice==1)
        {
            Shape C = new Circle();
            C.calculateArea();
            C.calculatePerimeter();
        }
        else if(choice==2)
        {
            Shape T = new Triangle();
            T.calculateArea();
            T.calculatePerimeter();
        }
    }
}