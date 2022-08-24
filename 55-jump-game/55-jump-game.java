class Solution {
    public void Display(int[] arr)
    {
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public boolean canJump(int[] nums) {
        int dp[]  = new int[nums.length+1];
        
        dp[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            int mj = nums[i];
            int temp=0;
            for(int j=i+1;j<=i+mj;j++)
            {
                if(j<dp.length)
                {
                    temp+=dp[j];
                }
                if(temp>0)
                {
                dp[i]=1;
                    break;
                }
            }
          
        }
        Display(dp);
        if(dp[0]!=0)return true;
        return false ;
    }
}