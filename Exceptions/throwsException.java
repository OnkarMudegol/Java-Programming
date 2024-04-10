//throws lists the types of exception that a method might throw
// appliacble to all classes, exccept Error and Runtime Exception
class throwsException{
    //here we have limited the method to throw only this type of exception
    public static int divideNum(int m, int n) throws ArithmeticException
    {
        int div = m/n;
        return div;
    }
    public static void main(String arg[])
    {
        throwsException obj = new throwsException();
        try{
            System.out.println(obj.divideNum(45,0));
        }
        catch(ArithmeticException e){
            System.out.println("Number cannot be divide by 0");
        }
    }
}