//We cannot create static methods or members inside inner class
class staticError
{
    void outerMethod()
    {
        System.out.println("Inside Outer Method.");
    }
    class Inner
    {
        public static void main(String args[])
        {
            System.out.println("Inside Inner Method.");
        }
    }
}