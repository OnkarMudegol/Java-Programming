class nestedTryCatch{
    public static void main(String arg[])
    {
        try{
            int a = Integer.parseInt(arg[0]);
            try{
                int b = Integer.parseInt(arg[1]);
                System.out.println(a/b);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Division by zero");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Need two parameters!");
        }
    }
}