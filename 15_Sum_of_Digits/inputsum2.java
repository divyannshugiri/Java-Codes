//Sum Of A Digits Of Number

import java.util.Scanner;

public class inputsum2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
          int sump=0;
             while(true)
             {
                 int i= sc.nextInt();
                 sump=sump+i;
         if(i==0){
            
                break;
                }
           
                }
            System.out.println(+sump);
            sc.close();
    }

    }