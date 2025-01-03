/****
 ****
 ****
 ****/

public class squarep {

    public static int pattern(int line){                //Method      
       for (int i=1;i<=line;i++)
       {
        System.out.println("****");
        
       }
       return line;
    }
  

    public static void main(String[] args) {
      
      pattern(4);                                // if we not use static in method then 
      pattern(4);
    
    
}
}