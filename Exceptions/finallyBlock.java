//Finally block is a block that always executes either after the execution of try and catch blocks(in case of exception) or after try block(in case of no exception). Generally used to close the program or deallocate the resources in case of exception. 
public class finallyBlock
{
    public static void main(String ars[])
    {
        try{
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println(100/0);
        }
        //Catch block is optional, if exception : finally folowed by exception msg
        //We can have multiple catch block for different type of exceptions, but one exception can be caught only once. 
        //Here if we put the Exception class one first then the Arithematic class after, it will give error as our exception is already caught once by the Exception superclass, leaving nothing for the ArithematicException subclass
        catch(ArithematicException e)
        {
            System.out.println("Inside catch block 1");
        }
        catch(Exception e)
        {
            System.out.println("Inside catch block 2");
        }
        finally{
            System.out.println("Inside finally block");
        }
    }
}