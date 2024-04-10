class generalisedException
{
    public static void main(String args[])
    {
        try{
            int a = 5;
            int b = 0;
            int c = a/b;
            System.out.println("Result is: "+c);
        }
        catch(Throwable e)
        {
            System.out.println(e);
        }
    }
}