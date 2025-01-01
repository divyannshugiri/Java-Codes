

public class largestseries {

    public static int getlargestseries(int number[]){

        int  largest =Integer.MIN_VALUE;
        int  smallest =Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            {
                if(largest < number[i])
                {
                    largest = number[i];
                }
                if(smallest > number[i]){
                    smallest =number[i];
                }
             }
            }
        for(int i=largest;i>=smallest;i--){
            System.out.println(i +"");
        }
        return largest;
        }
     
    public static void main(String[] args) {
        int number[]={2,1,6,4,3,5};

        getlargestseries(number);
    }
}
