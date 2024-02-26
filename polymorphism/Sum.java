//method overload the sum function using int, double and float 
import java.util.Scanner;
public class Sum { 
    public static void main(String[] args)  
    {   
        System.out.println(sum(5,6));// calling method with integer parameters
        System.out.println(sum(5.2,4.8));//calling method with double  parameters
        System.out.println(sum(5.2f,4.8f));//calling method with  float parameters
        System.out.println(sum('A',4));//calling method with string parameters
    }       
    static int sum(int x, int y)    
    {         
        return x + y;         
    }               
    static double sum(double x, double y)         
    {                                             
        return x + y;                
    }          
    static float sum(float x, float y)                            
    {                                                                          
        return x + y;                            
    }      
    static String sum(String x, int y)                            
    {                                                                          
        return (String)(x + y);                            
    }     
}