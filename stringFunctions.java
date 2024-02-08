public class stringFunctions{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.insert(5," Java");
        sb.replace(0,5,"Hi");
        String message = sb.toString();
        System.out.println(message);
    }
}