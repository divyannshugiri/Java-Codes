import java.util.Scanner;
 public class mTable
 {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the Multiplication Table : ");

    int x=sc.nextInt();
     
    for(int y=2;y<=10;y++)             //To multiply from 2 because input gets printed 1 times 
                 {                    
        System.out.println(x*y);
    }
    sc.close();
 
 }
 }