import java.util.Scanner;

public class leapYear{

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a Year to check if it is leap year or not");

    int year= sc.nextInt();

    if(year%4==0)
     {
        System.out.println("It is a Leap Year");
    }
    else
    {
        System.out.println("It is not a Leap Year");
    }
    sc.close();
}
}
/*A leap year is a year that contains an extra day, February 29th, in order to keep the calendar year synchronized 
with the astronomical year.In a normal year,February has 28 days, but in a leap year, February has 29 days. Leap years occur every 4 years.*/
 

//Explanation of the Code:

//year % 4 == 0: First, check if the year is divisible by 4,then it is a leap year.
//year % 100 != 0: If it is divisible by 100, it is not a leap year.
//year % 400 == 0: If the year is also divisible by 400, then it is a leap year.