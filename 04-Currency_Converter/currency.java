//Input currency in rupees and output in USD.
import java.util.Scanner;

public class currency {

    public static void main(String[] args){
   
    double exchangeRate =83.5;
    
        Scanner sc =new Scanner(System.in);

            System.out.println("Enter amount in Indian Rupees : ");
             
            int rupees=sc.nextInt();

            double usd=rupees/exchangeRate;

            System.out.printf("Amount in usd : %.2f\n",usd);

           sc.close();

    
    }
}