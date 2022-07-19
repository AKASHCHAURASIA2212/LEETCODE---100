class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = 0 ;
        
        for(int i=0;i<nums.length;i++)
        {
            n+=nums[i];
            i=i+1 ;
        }
        
        int[] ans = new int[n];
        int j=0;
        for(int i=0 ;i<n;i++)
        {
            int count = nums[j];
            int val = nums[j+1];
            while(count>0)
            {
                ans[i] = val ;
                i++;
                count--;
            }
            i--;
            j+=2 ;
        }
        return ans ; 
    }
}