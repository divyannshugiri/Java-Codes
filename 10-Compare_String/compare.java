//Compare 2 strings

//import java.util.Scanner;

public class compare
{

    public static void main(String args[])
    {
        String name1="Mercedes";
        String name2="Mercedes";

        if(name1.compareTo(name2) == 0)
        {
            System.out.println("They are the same string");
        }
        else
        {
            System.out.println("They are different string");
        }

    }
}

//In Java, the .compareTo() method is commonly used to compare two objects of the same type, particularly strings or numbers.

//it returns an integer value that indicates the relationship between the two objects.

// 0 == True                       1 == False