//Create a class named "Member" having the following memebers:
// 1.Name 
// 2.Age 
// 3.Phone Numbers
// 4.Address
// 5.Salary 
// It also has a method named "printSalary" which prints the salary of the members. Two clases "Employee" and "Manager" classes have data memebers "Specialization" and "Department" repectively. Now, assign name, age, phone number, address and salary to an  employee and a manager by making an object of both these classes and print the same.
import java.util.*;
class Member
{
    public String name, address;
    public int age, phoneNumber, salary;
    public void printInfo()
    {
        System.out.println("****Employee Details****");
        System.out.println("The name of the member is: "+name);
        System.out.println("The age of the member is: "+age);
        System.out.println("The phone number of the member is: "+phoneNumber);
        System.out.println("The address of the member is: "+address);
        System.out.println("The salary of the member is: "+salary);
    }
}
class Employee extends Member
{
    public String department, specialization;
    public void printInfo()
    {
        super.printInfo();
        System.out.println("The department of the member is: "+department);
        System.out.println("The specialization of the member is: "+specialization);
    }
}
class Manager extends Member
{
    public String department, specialization;
    public void printInfo()
    {
        super.printInfo();
        System.out.println("The department of the member is: "+department);
        System.out.println("The specialization of the member is: "+specialization);
    }
}
public class Problem_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.print("Enter the name of the employee: ");
        emp.name = sc.nextLine();
        System.out.print("Enter the age of the employee: ");
        emp.age = sc.nextInt();
        System.out.print("Enter the phone number of the employee: ");
        emp.phoneNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the address of the employee: ");
        emp.address = sc.nextLine();
        System.out.print("Enter the salary of the employee: ");
        emp.salary = sc.nextInt();
        System.out.print("Enter the department of the employee: ");
        emp.department = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter the specialization of the employee: ");
        emp.specialization = sc.nextLine();
        
        Manager man = new Manager();
        System.out.print("Enter the name of the manager: ");
        man.name = sc.nextLine();
        System.out.print("Enter the age of the manager: ");
        man.age = sc.nextInt();
        System.out.print("Enter the phone number of the manager: ");
        man.phoneNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the address of the manager: ");
        man.address = sc.nextLine();
        System.out.print("Enter the salary of the manager: ");
        man.salary = sc.nextInt();
        System.out.print("Enter the department of the manager: ");
        man.department = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter the specialization of the manager: ");
        man.specialization = sc.nextLine();
        emp.printInfo();
        man.printInfo();
    }
}