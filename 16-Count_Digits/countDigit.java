import java.util.Scanner;
                                                             //input,temp variable z,  while loop>0 ,count increse ,z/10, print count
public class countDigit {
    
public static void main(String[] args) {
     
    Scanner sc= new Scanner(System.in);
    int count=0;

    System.out.println("Enter a Number to check how many digit it has: ");

    int n=sc.nextInt();
    int z=n;

    while(z>0){
        count=count+1;           // if no is equal to 0 then count will increse by 1
        
        z=z/10;               //123= 123/10=0  /count+1      12/10=0    /count+1          1/10=0    /count+1       =3
       
    }
    System.out.println("No of Digits are: "+count);
    sc.close();


}

}
