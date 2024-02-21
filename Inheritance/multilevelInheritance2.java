import java.util.Scanner;
class Person
{
    protected String name;
    protected int age;
    public void getInfo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = scanner.nextLine();

        System.out.println("Enter the age: ");
        age  = scanner.nextInt(); 
    }
    public void displayInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Student extends Person
{
    private int RollNumber;
    public void getInfo()
    {
        super.getInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number: ");
        RollNumber =sc.nextInt();
    }
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Roll number: "+RollNumber);
    }
}
public class multilevelInheritance2
{
    public static void main(String args[])
    {
        Student st = new Student();
        st.getInfo();
        st.displayInfo();
    }
}