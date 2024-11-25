import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a character to check its case: ");
         
        char ch=sc.next().trim().charAt(0); //Trim is use to remove WhiteSpaces and chart at for checking specfic character case at given index.

        if(ch>='a' && ch<='z')
        {
            System.out.println("LowerCase");
        }
        else
        {
            System.out.println("UpperCase");
        }

        sc.close();
    }
    
}
