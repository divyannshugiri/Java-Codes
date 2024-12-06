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

/*"Amount in usd : %.2f\n": This is the format string that specifies how the output should look.

%.2f: This is the format specifier.

%: Indicates that we are using a format specifier.

.2: This tells Java to display 2 decimal places.

f: This tells Java that the value is a floating-point number (float or double).

\n: This is a newline character, which ensures that the output moves to the next line after printing. */