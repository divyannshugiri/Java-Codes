//Reverse A String In Java

import java.util.Scanner;

public class RevString 
{
    public static void main(String args[])
     {
        String name = "Divyanshu";

        
        int leng = name.length();

        String rev = "";  

        
        for (int i = leng - 1; i >= 0; i--)
         {
            rev = rev + name.charAt(i);
        }
        System.out.println("The Given String is "+name);
        System.out.println("Reverse of String is "+rev);
    }
}
