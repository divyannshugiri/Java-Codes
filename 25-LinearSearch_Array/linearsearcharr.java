

public class linearsearcharr
{
    public static int linearsearch(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i] == key)
            {
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {20,29,35,44,47,50,31,22,39,19};
        int key = 22;

        
        int index = linearsearch(numbers,key);

        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Index is at: "+index +".");
        }

    }
}