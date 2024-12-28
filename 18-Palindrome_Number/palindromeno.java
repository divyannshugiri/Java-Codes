// Palindrome Number =  if a original no is reverse and it is still the original no then it will be a palindrome no.

import java.util.Scanner;

public class palindromeno
{
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number to check if it is palindrome : ");

        int no =sc.nextInt();

        int Originalno= no;

        int rev=0;


        while(no>0){

           int digit=no%10;                // get last no                       121%10= 1

            rev = rev*10+digit;         // add the digit to reverse number      0*10=1= 1

            no=no/10;                  // remove the last no                    121=121/10= 12

            }

            if(Originalno == rev)
            {
                System.out.println("It is a Palindrome number");
            }
            else
            {
                System.out.println("It is not a palindrome number");
            }
       
            sc.close();
           }
    

}