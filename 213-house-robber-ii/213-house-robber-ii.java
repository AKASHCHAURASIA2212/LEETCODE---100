class Solution {
    
    public void Display(int[] arr)
    {
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public int rob(int[] nums) {
        
        if(nums.length==1)return nums[0];
        int dp1[] = new int[nums.length+1];
        int dp2[] = new int[nums.length+1];
        
        int len = nums.length;
        int lnum = nums[len-1];
        dp1[len-1]=lnum;
        
        int c1=lnum,p1=0;
        int c2=0,p2=0;
        
        for(int i=nums.length-2;i>=1;i--)
        {
               
                if(dp1[i+1]==c1)
                {
                    dp1[i]=p1+nums[i];
                }
                else
                {
                    dp1[i]=c1+nums[i];
                }
                if(dp1[i]>=c1)
                {
                    p1=c1;
                    c1=dp1[i];
                }
        }
        
        for(int i=nums.length-2;i>=0;i--)
        { 
                if(dp2[i+1]==c2)
                {
                    dp2[i]=p2+nums[i];
                }
                else
                {
                    dp2[i]=c2+nums[i];
                }
                if(dp2[i]>=c2)
                {
                    p2=c2;
                    c2=dp2[i];
                }
        }
        Display(dp1);
        Display(dp2);
        
        return Math.max(Math.max(c1,p1),Math.max(c2,p2));
        // return Math.max(Math.max(dp1[0],dp1[1]),Math.max(dp2[0],dp2[1]));
        
    }
}