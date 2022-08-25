class Solution {
    
    
    public int jump(int[] nums) {
        
        if(nums.length==1) return 0;
        int[] dp = new int[nums.length+1];
        
        for(int i=nums.length-2;i>=0;i--)
        {
            int min = Integer.MAX_VALUE-1;
            for(int jump =nums[i] ; jump>=1;jump--)
            {
                if(jump+i<dp.length)
                {
                    
                    min = Math.min(min,dp[jump+i]);
                    
                }
            }
            dp[i]=min+1;
        }
        // for(int x : dp)
        // {
        //     System.out.print(x+" ");
        // }
        // System.out.println();
        return dp[0];
    }
}