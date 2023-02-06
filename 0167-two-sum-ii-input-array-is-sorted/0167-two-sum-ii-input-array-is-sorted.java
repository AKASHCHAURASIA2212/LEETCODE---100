class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target){
                ans[0]=++i;
                ans[1]=++j;
                return ans;
            }else if(nums[i]+nums[j]<target){
                i++;
            }else if(nums[i]+nums[j]>target){
                j--;
            }
        }
        
        return ans;
    }
}