import java.io.*;
// class bufferedReader{
//     public static void main(String[] args) throws IOException
//     {
//         char c;
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter character, 'q' to quit.");
//         do{
//             c = (char)br.read();
//             System.out.println(c);
//         }while(c!='q');
//     }
// }

class bufferedReader{
    String name;
    int rollNo;
    double fee;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    void readData() throws IOException{
        System.out.print("Name : ");
        name=br.readLine();
        System.out.print("Roll No : ");
        rollNo=Integer.parseInt(br.readLine());
        System.out.print("Fees paid: ");
        fee=Double.parseDouble(br.readLine());
    }
    void displayData(){
        System.out.println("\nName : "+name);
        System.out.println("Roll No : "+rollNo);
        System.out.println("Fee Paid : "+fee+"\n");
    }
    public static void main(String arg[]) throws IOException
    {
        bufferedReader obj = new bufferedReader();
        obj.readData();
        obj.displayData();
    }
}