// Reverse A String In Java

//import java.util.Scanner;

public class revString 
{
    public static void main(String args[])
     {
        String name = "Divyanshu";

        
        int leng = name.length();     //  it will return length of name which is 9

        String rev = "";            

        
        for (int i = leng - 1; i >= 0; i--)        // i=9-1    9>=0    9-- =8                1-1         1>0       1--    =0
         {
            rev = rev + name.charAt(i);           //  uhsnayvid 
        }
        System.out.println("The Given String is "+name);
        System.out.println("Reverse of String is "+rev);
    }
}
