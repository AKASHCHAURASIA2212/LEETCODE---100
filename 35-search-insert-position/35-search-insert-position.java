class Solution {
    
    public int BinSearch(int[] nums,int target)
    {
         int i = 0 ;
         int j = nums.length-1;
        int mid = 0;
        while(i<=j)
        {
            
            mid = (i+j)/2;
            System.out.println("mid-->"+mid);
            // System.out.println("premid-->"+premid);
            
            if(nums[mid]==target)
            {
               return mid;
            }
            else if(nums[mid]<target)
            {
                  i=mid+1;
            }
            else
            {
                 j=mid-1;
            }
        }
        
        return mid;
    }
    public int searchInsert(int[] nums, int target) {
        int idx = BinSearch(nums,target);
        if(nums[idx]==target)
        {
            return idx;
        }
        if(nums[idx]<target)
        {
          return idx+1;
        }
        return idx;
        
    }
}