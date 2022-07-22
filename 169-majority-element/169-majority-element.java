class Solution {
    public int majorityElement(int[] nums) {
        // brute force 
        if(nums.length==1)
        {
            return nums[0];
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length/2 ;
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
                
                if(hm.get(nums[i])>n)
                {
                    return nums[i];
                }
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        return -1;
    }
}