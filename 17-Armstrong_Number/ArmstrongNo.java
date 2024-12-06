import java.util.Scanner;

public class ArmstrongNo 
{
 public static void main(String[] args) 
 {
 Scanner sc =new Scanner(System.in);
 int z,count=0,digit,i;
 System.out.println("Enter a Number");
 int n =sc.nextInt();
 z=n;
while(z>0)                                         // to check digits in a number 
 {
   count=count+1;                                  
   z=z/10;
  
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
}
}
