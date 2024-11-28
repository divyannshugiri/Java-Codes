//Java Program Vowel Or Consonant

import java.util.Scanner;


public class Vowel {

    public static void main (String args[])

    {
        Scanner sc=new Sanner(System.in);

        System.out.println("Enter a character to check it is vowel or consonant: ");

      char ch =sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch=='U');

        else if(ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
        {
            System.out.println("It is a Consonant");
        } 
        else 
        {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }

        sc.close(); 
    }
}



   