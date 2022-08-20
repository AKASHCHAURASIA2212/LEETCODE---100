class Solution {
    
    // normal recursion 
//     public int fib(int n) {
        
//         if(n==0 || n==1)
//         {
//             return n ;
//         }
//         int n1 = fib(n-1);
//         int n2 = fib(n-2);
        
//         int no = n1+n2 ; 
//         return no ;
//     }
    
    public int fibb(int x , int[]dp)
    {
        if(x==0 || x==1)
        {
            return dp[x]=x ;
        }
        
        if(dp[x]!=0)
        {
            return dp[x];
        }
        
        int n1 = fibb(x-1,dp);
        int n2 = fibb(x-2,dp);
        
        dp[x] = n1+n2 ;
        
        return dp[x];
        
    }
        public int fib(int n) {
        
        int[] dp = new int[n+1];
            
           return  fibb(n,dp);
            
            
    }
}