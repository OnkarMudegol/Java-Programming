class rethrowException{
    static void demo()
    {
        try{
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e){
            System.out.println("Caught inside demo");
            throw e; //rethrowing the exception
        }
    }
    public static void main(String args[])
    {
        try{
            demo();
        }
        catch(NullPointerException e)
        {
            System.out.println("Recaught "+e);
        }
    }
}
