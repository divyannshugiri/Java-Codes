import java.util.Scanner;

public class bill {

    public static void main(String[] args)
    {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the no of pizzas bought:");
        int pizzas=sc.nextInt();

        System.out.println("Enter the no of puffs bought:");
        int puffs =sc.nextInt();

        System.out.println("Enter the no of cold drinks bought:");
        int coldDrinks =sc.nextInt();

        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+ pizzas);
        System.out.println("No of puffs:"+ puffs);
        System.out.println("No of colddrinks:"+ coldDrinks);
        

        pizzas = pizzas * 100;
        puffs = puffs * 20;
        coldDrinks = coldDrinks * 10;

        int totalPrice = pizzas + puffs +coldDrinks;
        System.out.println("Total price ="+ totalPrice);
        System.out.println("ENJOY THE SHOW!!!");

        sc.close();


    }
    
}
