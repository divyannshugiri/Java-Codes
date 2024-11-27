Java Program Vowel Or Consonant

import java.util.Scanner;


public class Vowel {

    public ststic void main (String args[])

    {
        Scanner sc=new Sanner(System.in);

        System.out.println("Enter a character to check it is vowel or consonant: ");

      char ch =sc.next();

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
        {
            System.out.println("It is a Vowel");
        }
        else
         {
            System.out.println("It is a consonant");
         }

    }
    
}
