//Throw is applicable to only predefined exception
// throw keyword is used to throw an exception explicitly
//1. To throw user defined exception
//2. To customize the mesasge to be displayed by predefined exceptions
//3. To rethrow a caught exception
class throwException{
    public static void checkNum(int num)
    {
        if(num<1){
            //Customised message for Arithmetic Exception
            throw new ArithmeticException("Number is negative");
        }
        else
        {
            System.out.println("The square of the number is: "+(num*num));
        }
    }
    public static void main(String arg[])
    {
        throwException obj = new throwException();
        obj.checkNum(6);
        obj.checkNum(-8);
    }
}