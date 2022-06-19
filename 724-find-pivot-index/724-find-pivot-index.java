class Solution {
     public int pivotIndex(int[] nums) {
        
        int sum=0,leftsum=0;
        for(int i:nums)sum+=i;
        int i=0;
        while(i<nums.length){
            if(leftsum==sum-nums[i]-leftsum)return i;
            leftsum+=nums[i];
            i++;
        }
        return -1;
    }
}