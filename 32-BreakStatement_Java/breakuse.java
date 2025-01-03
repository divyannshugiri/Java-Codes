//Break :- It is use to exit the loop. 

public class breakuse {

    public static int breaks(int i){

        for(i=1;i<=50;i++)
        {
            if(i == 22){
              
                break;
            
            }
            System.out.println(i);
           
        }
  return i;
}
    public static void main(String[] args) {
        int i=1;
        breaks(i);
    }
    
}
