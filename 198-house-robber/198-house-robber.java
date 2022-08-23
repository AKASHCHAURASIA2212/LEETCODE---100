class Solution {
  // recursion  
    public int myRob(int[] arr ,int idx ,int sum)
    {
        if(idx>=arr.length)return sum ;
        
        int rob = myRob(arr,idx+2,sum+arr[idx]);
        
        int norob = myRob(arr,idx+1,sum);
        
        return Math.max(norob,rob);
    }
    
   public int rob(int[] nums)
   {
       
       int size = nums.length;
       int dp[] = new int[size+1];
       dp[size-1] = nums[size-1];
       int cmax = nums[size-1];
       int pmax=0;
       for(int i = nums.length-2;i>=0;i--)
       {
           int val = nums[i];
           if(cmax==dp[i+1])
           {
               dp[i]=pmax+nums[i];
           }
           else
           {
               dp[i]=cmax+nums[i];
           }
           if(dp[i]>=cmax)
               {
                   pmax = cmax ;
                   cmax = dp[i];
               }
       }
       
       return Math.max(dp[0],dp[1]);
   }
}