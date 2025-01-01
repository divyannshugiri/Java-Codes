

public class smallestseries {

    public static int getsmallestseries(int number[])
    {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            if(smallest > number[i])
            {
                smallest = number[i];
            }
            if(largest < number[i]){
                largest = number[i];
            }
        }

        for(int i= smallest;i<=largest;i++){
            System.out.println(i +"");
        }
        return smallest;
    }

    public static void main(String[] args) {
        int number[]={2,1,3,4,5};

  getsmallestseries(number);
    }
    
}
