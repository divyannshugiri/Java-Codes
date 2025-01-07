// Power in java

import java.util.Scanner;

public class power 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Base");

       int base=sc.nextInt();

       final int exponent=3;

      double result = (Math.pow(base,exponent));
       
      System.out.println("The Power is "+result);

        sc.close();
    }
   
}   
    

//This method takes two double arguments and returns a double result.
// Even if you pass integer values to Math.pow(), the method will convert them to double before performing the calculation.
//As a result, you need to store the result in a variable of type double.

//If you try to store the result in an int like this:

//int result = Math.pow(base, exponent);  // This will give a compile-time error

//You'd get a compile-time error because Math.pow() returns a double, which cannot be automatically converted to an int without explicit casting.

//If you want the result of the power calculation to be in integer form, you can:

//Use Math.pow() for the calculation, but cast the result to int to convert it from a double to an int.

//int result = (int) Math.pow(base, exponent);  // Casting double result to int