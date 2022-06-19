class Solution {
    public int pivotIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            int pivot = i ; 
            int ls=0;
            int rs=0;
            for(int j=0;j<nums.length;j++)
            {
                if(j==pivot)
                {
                    continue;
                }
                
                if(j<pivot)
                {
                    ls+=nums[j];
                }
                else if(j>pivot)
                {
                    rs+=nums[j];
                }
            }
            
            if(ls==rs)
            {
                return pivot;
            }
        }
        return -1;
    }
}