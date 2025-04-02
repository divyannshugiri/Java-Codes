import java.util.Arrays;
class Solution {
   static public int getSecondLargest(int[] arr) //method
    {
        
        int n=arr.length;            //    stores the length of array which is 6
        
        Arrays.sort(arr);            //  sort the array in ascending order [1,1,10,12,34,35]
        
        for(int i = n-2;i>=0;i--)    // i=34      
        {
            if(arr[i]!= arr[n-1])    // if arr[i] is not equal to largest no then return second largest no
            {
                return arr[i];
            }
        }
        return -1;                    // if the second largest element dont exist then return -1
    }                                // class ends
    public static void main(String[] args)
    {
        int[] arr ={12,35,1,10,34,1};
        System.out.println(getSecondLargest(arr));
    }
        
}    
    