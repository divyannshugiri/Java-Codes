//Java Program Vowel Or Consonant

import java.util.Scanner;


public class Vowel {

    public static void main (String args[])

    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a character to check it is vowel or consonant: ");

      char ch =sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch=='U')
        {
            System.out.println("It is Vowel");
        }
        else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
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

/* Alternative Program 
 
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check if it is a vowel or consonant: ");
        
        char ch = sc.next().toLowerCase().charAt(0);  // Convert input to lowercase for simplicity
        
        if ("aeiou".indexOf(ch) != -1) {
            System.out.println("It is Vowel");
        } else if (Character.isLetter(ch)) {
            System.out.println("It is a Consonant");
        } else {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }
        
        sc.close();
    }
}



*/

   