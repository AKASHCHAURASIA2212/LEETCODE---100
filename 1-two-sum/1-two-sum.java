class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // int[] ans = new int[2];
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //          if(nums[i]+nums[j]==target){
        //              ans[0]=i;
        //              ans[1]=j;
        //              return ans;
        //          }
        //     }
        // }
        // return ans;
        HashMap<Integer,Integer> tar = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            tar.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            int key = target-nums[i];
            if(tar.containsKey(key)&& key+nums[i]==target && tar.get(key)!=i)
            {
                Integer j = tar.get(key);
                if(j!=null)
                {
                int ans[] = {i,j};
                return ans;  
                }
            
            }
        }
        int ans[] = {-1,-1};
        return ans;
    }
}