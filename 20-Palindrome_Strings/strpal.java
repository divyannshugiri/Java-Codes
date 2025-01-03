/*A string palindrome is a sequence of characters (a string) that reads the same forward and backward, ignoring spaces, punctuation, and case sensitivity.

Examples of string palindromes:
"racecar"
"madam"
"level" 

*/



import java.util.Scanner;

public class strpal
{

public static void main(String [] args) 
{
    Scanner sc =new Scanner(System.in);

    System.out.println("Enter a String to check for palindrome");
     
    String name = sc.nextLine();

    int leng = name.length();

    String rev ="";

    for(int i=leng-1;i>=0;i--)
    {
        rev=rev+name.charAt(i);
    }
    
    if (name.equals(rev))
    {
        System.out.println("It is a Palindrome String");

    }
    else
    {
        System.out.println("Not a Palindrome String");
    }

    sc.close();
}


}


