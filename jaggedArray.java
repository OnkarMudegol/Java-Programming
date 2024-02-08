// Array in which each row acts as an individual and has variable length
public class jaggedArray{
    public static void main(String args[])
    {
        int arr[][]=new int[2][];
        // First row has 3 clumns
        arr[0]=new int[3];
        // First row has 2 clumns
        arr[1]=new int[2];
        // intialising array
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = count++;
            }
        }
        System.out.println("Contents of 2D Jagged Array: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}