// Array in which each row acts as an individual and has variable length
// public class jaggedArray{
//     public static void main(String args[])
//     {
//         int arr[][]=new int[2][];
//         // First row has 3 clumns
//         arr[0]=new int[3];
//         // First row has 2 clumns
//         arr[1]=new int[2];
//         // intialising array
//         int count=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr[i].length;j++)
//             {
//                 arr[i][j] = count++;
//             }
//         }
//         System.out.println("Contents of 2D Jagged Array: ");
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr[i].length;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }


// Dynamic
import java.util.Scanner;
public class jaggedArray{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of sub-arrays: ");
        int numberOfArrays = scan.nextInt();
        int jaggedArray[][]=new int[numberOfArrays][];
        for(int i=0;i<numberOfArrays;i++)
        {
            System.out.print("Enter the size of sub-array"+(i+1)+": ");
            int sizeOfSubArray = scan.nextInt();
            jaggedArray[i] = new int[sizeOfSubArray];
        }
        for(int i=0;i<jaggedArray.length;i++)
        {
            for(int j=0;j<jaggedArray[i].length;j++)
            {
                System.out.print("Enter the value for row "+(i+1)+" column "+(j+1) +": ");
                jaggedArray[i][j]=scan.nextInt();
            }
            System.out.print("\n");
        }
        System.out.println("Contents of 2D Jagged Array: ");
        for(int i=0;i<jaggedArray.length;i++)
        {
            for(int j=0;j<jaggedArray[i].length;j++)
            {
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}