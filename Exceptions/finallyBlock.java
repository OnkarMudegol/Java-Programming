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
        // catch(Exception e)
        // {
        //     System.out.println("Inside catch block");
        // }
        finally{
            System.out.println("Inside finally block");
        }
    }
}