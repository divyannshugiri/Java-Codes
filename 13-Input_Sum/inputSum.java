//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop

import java.util.Scanner;

public class inputSum 
{
public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    int sum=0;

    while(true)
    {
        int i=sc.nextInt();
        
        if(i==0)
        {
            System.out.println("User enters 0");
            break;
        }
        
        sum=sum+i;
    }
    
    System.out.println("The sum of Input is: "+sum);
    
    sc.close();
}

}
