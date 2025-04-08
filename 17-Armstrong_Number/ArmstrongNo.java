import java.util.Scanner;

public class ArmstrongNo 
{
 public static void main(String[] args) 
 {
 Scanner sc =new Scanner(System.in);
 int z,count=0,digit,i;
 System.out.println("Enter a Number");
 int n =sc.nextInt();
 z=n;                                              // store original number
while(z>0)                                         // to check digits in a number 
 {
   count=count+1;                                  
   z=z/10;                                        // remove the last no                            
  
 }  

 z=n;                                          // to get reminder and getting the power of it and adding to sum
 
 int sum=0;                                      
 
 while(z>0)                                   //153>0   true
   {
     digit=z%10;                              // digit=153%10         will get reminder  3      5 
      int pro=1;                          
        
      for(i=1;i<=count;i++)                   // 1<=3,  true          1<=5   true
         {
         pro=pro*digit;                       // 1=1*3    result 3  9   27        1=1*5  result 5  25       125
         }                    
        
         sum=sum+pro;                          // sum=27                      sum=125+25          sum=150
         z=z/10;                               // 153/10= 15                  15/10=1
   }


   if(sum==n)                                  // checking if sum is equal to number
   {
      System.out.println("It is a Armstrong Number");
   }
   else
   {
      System.out.println("It is not a Armstrong Number");
   }
   sc.close();
}
}
/*
An Armstrong number (also known as a Narcissistic number or Pluperfect digital invariant) is a number that is equal 
to the sum of its own digits, each raised to the power of the number of digits.

For example:

153 is an Armstrong number because:

1 cube + 5 cube + 3 cube = 153


(Here, 153 has 3 digits, and the sum of the cubes of its digits is 153.)

153   
1. CHECK THE COUNT OF NO 
2. GET THE LAST NO WHICH IS 3
3. PERFORM MULTIPICATION
4. ADD IT TO SUM
5. REMOVE THE LAST ELEMENT 3
6. AGAIN PERFROM THE SAME PROCESS FOR 5
7.check if the number is equal to sum
8. print if it is armstrong np or not


*/
