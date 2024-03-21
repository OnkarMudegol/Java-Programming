abstract class Sunstar
{
    abstract void printInfo();
}
class Employee extends Sunstar{
    void printInfo()
    {
        String name = "abc";
        int age = 23;
        float salary = 222.2f;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
class upCasting
{
    public static void main(String args[])
    {
        Sunstar s = new Employee();  
        //Upcasting - when an object of the base class is cretaed but memory allocation is done using the derived class.
        s.printInfo();
    }
}