import java.util.Scanner;

public class replacestr
{
public static void main(String[] args)
 {
    Scanner sc =new Scanner(System.in);

    System.out.println("Enter a String");

    String str=sc.nextLine();

    System.out.println("Enter a word to replace");
    
    String oldWord=sc.nextLine();

    System.out.println("Enter a new word to replace with");

    String newWord=sc.nextLine();

    String replace = str.replace(oldWord,newWord);

    System.out.println("String Given is    :"+str);
    System.out.println("Replaced String is : "+replace);

    sc.close();

}

}





/*import java.util;

public class replacestr
{
public static void main(String[] args) 
{
   

    String str ="Hello World";

    String replaced = str.replace("World","Divyanshu");
    
    System.out.println("String Given is   :  "+str);
    System.out.println("Replace String is : "+replaced);
    
}

}*/
