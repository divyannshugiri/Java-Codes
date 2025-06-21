import java.util.Scanner;
public class countdown
{
    public static void main (String[] args) throws InterruptedException
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a second to count down till");
        int max=sc.nextInt();
        for(int i=max;i>=0;i--)
        {
        System.out.println(+i);
        Thread.sleep(1000);
        
    }
     System.out.println("HAPPY NEW YEAR");
    }
}