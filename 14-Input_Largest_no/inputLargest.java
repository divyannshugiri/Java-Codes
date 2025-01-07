//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class inputLargest {
                                                                       //  loop while, input, num>max,max=num,enters 0 ,terminate,print max
    public static void main(String[] args) {                                     
        
        Scanner sc =new Scanner(System.in);
        
        int max=0;

        while(true)
        {
            int i =sc.nextInt();
          
            
            if(i>max)
            {
                max=i;
            }
           
            if(i==0)
            {
            System.out.println("User enters 0");
            
            break;
            }
        }
           
           System.out.println("Largest No from the input given is: "+max);      
          
           sc.close();
        }

        }
       
        
