class Solution {
    
        public int fibb(int x , int[]dp)
    {
        if(x==0 || x==1 )
        {
            return dp[x]=x ;
        }
        else if(x==2)
        {
            return dp[x]=1;
        }
        
        if(dp[x]!=-1)
        {
            return dp[x];
        }
        
        int n1 = fibb(x-1,dp);
        int n2 = fibb(x-2,dp);
        int n3 = fibb(x-3,dp);
        
        dp[x] = n1+n2+n3 ;
        
        return dp[x];
        
    }
    
    // dp
        public int tribonacci(int n) {
        
        int[] dp = new int[n+1];
            Arrays.fill(dp,-1);
           fibb(n,dp);
            
            // for(int x : dp)
            // {
            //     System.out.print(x+" ");
            // }
            return dp[n];
            
            
    }
    
}