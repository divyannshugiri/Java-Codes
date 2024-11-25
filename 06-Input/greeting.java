//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class greeting {

    public static void main(String args[])
    {
        Scanner n= new Scanner(System.in);

        System.out.println("Enter Your Name ");

        String name=n.nextLine();

        System.out.println("Good Morning "+name);
    
        n.close();
    
    }
    
}
