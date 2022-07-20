class Solution {
    public int minMoves2(int[] nums) {
        int sum = 0 ;
        
        Arrays.sort(nums);
        
        int ans = nums[nums.length/2];
        int count =0 ;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]<ans)
           {
               count=count+(ans-nums[i]);
           }
            else if(nums[i]>ans)
            {
                count+=(nums[i]-ans);
            }
            
        }
        return count;
    }
}