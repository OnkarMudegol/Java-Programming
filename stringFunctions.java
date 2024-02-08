public class stringFunctions{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.insert(5," Java");
        String message = sb.toString();
        System.out.println(message);
    }
}