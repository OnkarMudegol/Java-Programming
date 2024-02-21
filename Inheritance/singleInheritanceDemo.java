import java.util.Scanner;
class Marks
{
    public int id;
    public float javaMarks, cppMarks, cMarks;
    public void setMarks()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks of Java: ");
        javaMarks = scanner.nextFloat();
        System.out.print("Enter the marks of CPP: ");
        cppMarks = scanner.nextFloat();
        System.out.print("Enter the marks of C: ");
        cMarks = scanner.nextFloat();
    }
    public void displayMarks()
    {
        System.out.println("Java Marks: "+javaMarks);
        System.out.println("CPP Marks: "+cppMarks);
        System.out.println("C Marks: "+cMarks);
    }
}
class Result extends Marks{
    public float total, average;
    public void compute()
    {
        total = super.javaMarks + super.cppMarks + super.cMarks;
        average = total / 3;
    }
    public void showResult()
    {
        System.out.println("Total Marks: " +total);
        System.out.println("Avg Marks: " +average);

    }
}
public class singleInheritanceDemo
{
    public static void main(String args[])
    {
        Result result = new Result();
        result.setMarks();
        result.displayMarks();
        result.compute();
        result.showResult();
    }

}