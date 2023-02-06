class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int val = target-nums[i];
            
            if(map.containsKey(val)==false){
                map.put(nums[i],i);
            }else{
                int idx2 = map.get(val);
                ans[0]=i;
                ans[1]=idx2;
                return ans;
            }
        }
        
        return ans;
    }
}