class SameelementArray {

  static  public boolean findSameno(int[] nums)
    {
       int n=nums.length;
      //  int i=0;
      //  int j=i+1;
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
        while (nums[i] == nums[j]) // condition : if the nums[i] has same element as in  nums[j]    return true
        {
            return true;
        }
        
        }
      }
      return false;
    }

    

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(findSameno(nums));
    }
    
}
