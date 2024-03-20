//WAP to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee()
class Employee
{
    public void work()
    {
        System.out.println("Employee works.");
    }
    public void getSalary()
    {
        System.out.println("The salary of an employee is Rs.25000");
    }
}
class HRManager extends Employee
{
    public void work()
    {
        System.out.println("HR Manager makes sures everyone is comfortable at work.");
    }
    public void addEmployee()
    {
        System.out.println("Hiring is the reponsibility of the HR Manager");
    }
}
public class Problem_1
{
    public static void main(String a[])
    {
        Employee EM = new Employee();
        EM.work();
        EM.getSalary();
        HRManager HR = new HRManager();
        HR.work();
        HR.getSalary();
        HR.addEmployee();
    }
}