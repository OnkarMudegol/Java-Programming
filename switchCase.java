import java.util.Scanner;
public class switchCase
{
    public static void main(String args[])
    {

    Scanner sc = new Scanner(System.in);
    String branch;
    int year;
    System.out.println("Enter the branch: ");
    branch = sc.nextLine();
    System.out.println("Enter the year: ");
    year = sc.nextInt();
    switch(year)
    {
        case 1:
            switch(branch)
            {
                case "CSE":
                    System.out.println("First year CSE student.");
                    break;
                case "ECE":
                    System.out.println("First year ECE student.");
                    break;
                case "Mechanical":
                    System.out.println("First year Mechanical student.");
                    break;
                case "Aerospace":
                    System.out.println("First year Aerospace student.");
                    break;
                default:
                    System.out.println("Invalid course input!!");
                    return;
            }
            break;
        case 2:
            switch(branch)
            {
                case "CSE":
                    System.out.println("Second year CSE student.");
                    break;
                case "ECE":
                    System.out.println("Second year ECE student.");
                    break;
                case "Mechanical":
                    System.out.println("Second year Mechanical student.");
                    break;
                case "Aerospace":
                    System.out.println("Second year Aerospace student.");
                    break;
                default:
                    System.out.println("Invalid course input!!");
                    return;
            }
            break;
        default:
            System.out.println("Invalid year input!!");
            return;
    }
    }
}