//Initialization with Integer.MIN_VALUE and Integer.MAX_VALUE:

/*largest is initialized to Integer.MIN_VALUE, which is the smallest possible integer value (-2,147,483,648). 
This ensures that no matter what numbers are in the array, any number in the array will be larger than Integer.MIN_VALUE, 
so largest will get updated with the first element in the array.

smallest is initialized to Integer.MAX_VALUE, which is the largest possible integer value (2,147,483,647). 
This ensures that the first number in the array will be smaller than Integer.MAX_VALUE, and smallest will be updated with the first element in the array.*/


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
