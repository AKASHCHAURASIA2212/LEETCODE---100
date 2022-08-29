class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0 || n==1){
            return n ;
        }
        int[] dp = new int[n+1] ;
        dp[0]=0;
        dp[1]=1;
        int max=0;
        for(int i=2;i<=n;i++){
             if(i%2==0){
                 int idx = i/2 ;
                 dp[i] = dp[idx];
             } else{
                int idx1 = i/2;
                dp[i] = dp[idx1]+dp[idx1+1] ;
            }
              if(dp[i]>max){
                     max=dp[i];
                 }
        }
        return max;
    }
}