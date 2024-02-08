public class buffervsBuilder
{
    public static void main(String args[])
    {
        StringBuffer buffer = new StringBuffer("Hello");
        buffre.append("Java");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder("Hello");
        builder.append("Java");
        System.out.println(builder);
    }
}