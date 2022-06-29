class Solution {
    
    public void swap(int[] nums,int i,int j)
    {
          int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
    }
    // public void shiftLeft(int[] nums,int idx)
    // {
    //     for(int i=idx;i<nums.length-1;i++)
    //     {
    //        swap(nums,i,i+1);
    //     }
    // }
    public void moveZeroes(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            boolean temp = true;
            
            if(nums[i]==0)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    temp = false ;
                    if(nums[j]!=0)
                    {
                       swap(nums,i,j);
                        temp = true;
                        break;
                    }
                }
            }
            
               if(!temp)
                {
                    break;
                }
           
        }
        
    }
}