class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long count=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }else{
                // System.out.println(count+" --> "+nums[i]);
                long res = (count*(count+1))/2;
                ans+=res;
                count=0;
            }
        }
        long res = (count*(count+1))/2;
                ans+=res;
        return ans;
    }
}