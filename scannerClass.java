import java.util.Scanner;
// public class scannerClass
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         // String input
//         String name = sc.nextLine();
//         // Character input
//         char gender = sc.next().charAt(0);

//         // Numeric input
//         int age = sc.nextInt();
//         long mobileNo = sc.nextLong();
//         double cgpa = sc.nextDouble();
//         float attendance = sc.nextFloat();

//         System.out.println("Name: "+name);
//         System.out.println("Gender: "+gender);
//         System.out.println("Age: "+age);
//         System.out.println("Mobile no.: "+mobileNo);
//         System.out.println("CGPA: "+cgpa);
//         System.out.println("Attendance: "+attendance);
//     }
// }

//To take multiple inputs using scanner class, when number of input is known
// public class scannerClass
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int count =0, sum=0;
//         System.out.print("Enter the number of inputs: ");
//         count = sc.nextInt();
//         while(count>0)
//         {
//             int num = sc.nextInt();
//             sum += num;
//             count--;
//         }
//         System.out.print("The sum of the input is: "+sum);
//     }
// }


//To take multiple inputs using scanner class, when number of input is not known
public class scannerClass{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count=0;
        System.out.println("Enter the numbers: ");
        while(sc.hasNextInt())
        {
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        if(count>0)
        {
            System.out.println("The sum of the number is: "+sum);
        }
        else
        {
            System.out.println("No numbers entered!! Cannot calculate sum.");
        }
    }   
}