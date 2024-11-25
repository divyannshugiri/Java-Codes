//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class largestNo{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the First no");
         int a=sc.nextInt();
       
        System.out.println("Enter the Second no");
         int b=sc.nextInt();

       if(a>b){
            System.out.println("First is largest no");
       }
       else{
            System.out.println("Second is largest no");
       }

      sc.close();

    }
}