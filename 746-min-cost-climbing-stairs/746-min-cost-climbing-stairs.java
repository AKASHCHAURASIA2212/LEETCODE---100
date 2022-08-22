class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        for(int i=cost.length-2;i>=0;i--)
        {
            int v1=0,v2=0;
            int sum = cost[i];
            v1 = cost[i+1];
            if(i+2!=cost.length)
            {
                v2=cost[i+2];
            }
            sum+=Math.min(v1,v2);
            cost[i]=sum;
        }
        
        return Math.min(cost[0],cost[1]);
    }
}