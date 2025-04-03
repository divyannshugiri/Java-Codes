

class nonZero
{
    void pushZerosToEnd(int[] arr)
    {
        int n =arr.length;

        int nonZeroIndex=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i] != 0);
            {                                      //Swap values
                int temp=arr[i];          // 1 
                arr[i]= arr[nonZeroIndex];//0
                arr[nonZeroIndex] =temp;  //1
                nonZeroIndex++;        // next 0 position                 [1  ,  2  , 0 , 4  ,3  ,0  ,5  0]
            }                                                     //      [0  ,  0  , 0 , 0  ,0,  0,  0, 0]                           ]
        }                                                         // ANS  [1  ,  2  , 4 , 3  ,5,  0,  0, 0]
    }

public static void main(String[] args) {
    int[] arr ={1  ,  2  , 0 , 4  ,3  ,0  ,5  ,0 };
}

}       








