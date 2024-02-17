// public class stringFunctions{
//     public static void main(String args[])
//     {
//         StringBuffer sb = new StringBuffer();
//         sb.append("Hello");
//         sb.append(" ");
//         sb.append("World");
//         sb.insert(5," Java");
//         sb.replace(0,5,"Hi");
//         String message = sb.toString();
//         System.out.println(message);
//     }
// }

public class stringFunctions
{
    public static  void main(String[] args) 
    {
        String s = "Opportunities don't happen, you create them";
    System.out.println("String length: "+s.length());
    System.out.println("Character at third position: "+s.charAt(3));
    //From 3 onwards till end
    System.out.println("Substring: "+s.substring(3));
    //between 2 and 5
    System.out.println("Substring: "+s.substring(2,5));
    String s1 = "Oppurtunities";
    String s2 = " Don't happen";
    System.out.println("Concatenated string: "+s1.concat(s2));
    //To find out the forst occurence
    String s4 = "Learn Share Learn";
    System.out.println("Index of Share: "+s4.indexOf("Share"));
    //To find the first occurence from a given index
    System.out.println("Index of a: "+s4.indexOf('a',3));
    String word1 = "OppuTunitieS";
    System.out.println("Changing to uppercase: "+word1.toUpperCase());
    String word2 = "OppuTunitieS";
    System.out.println("Changing to lowercase: "+word1.toLowerCase());
    String word3 = "   Learn Share Learn";
    System.out.println("Trimming the word: "+word3.trim());

    }

}