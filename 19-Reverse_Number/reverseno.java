import java.util.Scanner;

public class reverseno
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a Number to reverse");

        int no=sc.nextInt();

        int rev=0;

        while(no>0)
        {
            int digit=no%10;  // remove last digit

            rev=rev*10+digit;  // add the digit to reverse no

            no=no/10;         //remove the last digit

            
        }
        System.out.println("Reverse Number is :" +rev);

        sc.close();
        
    }
  
}
