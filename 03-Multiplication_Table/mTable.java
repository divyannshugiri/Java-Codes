import java.util.Scanner;
 public class mTable
 {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the Multiplication Table : ");

    int x=sc.nextInt();
     
    for(int y=2;y<=10;y++)             //To multiply from 2 because input gets printed 1 times 
                 {                     //and multiplication also start from 1 therfore it printed 2 times to avoid this we multiply from 2 
        System.out.println(x*y);
    }
    sc.close();
 
 }
 }