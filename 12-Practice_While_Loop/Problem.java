// Problem Statement:Take integer inputs till the user enters 0  (HINT: while loop)
 
import java.util.Scanner;

public class Problem
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            int i=sc.nextInt();
            
            if(i==0)
            {
                System.out.println("User Enters 0");
                break;
            }
        
        }
        sc.close();
    }
}