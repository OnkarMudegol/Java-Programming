//Write a Java Program to create an abstract class Vehicle with anstrct methods startEngine() and stopEngine(). Create sunclasses Car and Motorcycle that extends the Vehicle class and implements the respective methods to start and stop the engines for each vehicle type.
abstract class Vehicle
{
    abstract void startEngine();
    abstract void stopEngine();
}
class Car extends Vehicle
{
    void startEngine()
    {
        System.out.println("Starting car engine.");
    }
    void stopEngine()
    {
        System.out.println("Stopping car engine.");
    }
}
class Bike extends Vehicle
{
    void startEngine()
    {
        System.out.println("Starting bike engine.");
    }
    void stopEngine()
    {
        System.out.println("Stopping bike engine.");
    }
}
public class abstractClassQuestion_2
{
    public static void main(String args[])
    {
        Vehicle C1 = new Car();
        C1.startEngine();
        C1.stopEngine();
        Vehicle B1 = new Bike();
        B1.startEngine();
        B1.stopEngine();
    }
}