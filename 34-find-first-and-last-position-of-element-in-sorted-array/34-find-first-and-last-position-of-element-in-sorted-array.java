class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1,-1};
        
        if(nums.length==0)
        {
          return ans;
        }
        
        int i=0,j=nums.length-1;
        boolean flag1=true,flag2=true;
        while(i<nums.length && j>=0)
        {
            if(flag1!=false || flag2!=false)
            {
                if(flag1)
                  {
                      if(nums[i]==target)
                      {
                          ans[0]=i;
                          flag1=false;
                      }
                      i++;
                  }
            
            if(flag2)
              {
                  if(nums[j]==target)
                  {
                      ans[1]=j;
                      flag2=false;
                  }

                    j--;
              }
            }
            else
            {
                break;
            }
        }
        return ans ;
    }
}