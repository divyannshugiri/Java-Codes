
public class smallestno {

    public static int getsmallest(int number[])
    {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length;i++)
        {
            if(smallest > number[i])
            {
                smallest = number[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int number[]= {2,1,6,4,5};

        System.out.println("Smallest no is : "+getsmallest(number));
        


    }
}