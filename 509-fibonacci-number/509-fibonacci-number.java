class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        fibbo(n,dp);
        
        for(int i=0;i<=n;i++)
        {
            System.out.print(dp[i]+" ");
        }
        return dp[n];
    }
    
    public int fibbo(int n,int[]dp)
    {
        if(n==0 || n==1)
        {
            dp[n]=n;
            
            return n;
        }
        
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        
        int ans1 = fibbo(n-1,dp);
        int ans2 = fibbo(n-2,dp);
        
        dp[n] = ans1+ans2;
        
        return dp[n];
    }
}