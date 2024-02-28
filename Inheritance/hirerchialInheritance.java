class Employee
{
    double salary = 50000;
    void displaySalary()
    {
        System.out.println("Employee Salary : " +salary);
    }
}
class FullTimeEmployee extends Employee{
    double hike = 0.50;
    void incrementSalary()
    {
        salary = salary + (salary*hike);
    }
}
class InternEmployee extends Employee{
    double hike = 0.25;
    void incrementSalary()
    {
        salary = salary + (salary*hike);
    }
}
public class hirerchialInheritance{
    public static void main(String args[])
    {
        FullTimeEmployee emp1 = new FullTimeEmployee();
        InternEmployee emp2 = new InternEmployee();
        System.out.println("Salary of a full time employee before incrementing: ");
        emp1.displaySalary();
        System.out.println("Salary of a intern before incrementing: ");
        emp2.displaySalary();
        emp1.incrementSalary();
        emp2.incrementSalary();
        System.out.println("\nSalary of a full time employee after incrementing: ");
        emp1.display();
        System.out.println("\nSalary of a intern after incrementing: ");
        emp2.display();
    }
}