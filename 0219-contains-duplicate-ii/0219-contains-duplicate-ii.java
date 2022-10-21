class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // brute force 
         // for(int i=0;i<nums.length;i++){
         //     for(int j=i+1;j<nums.length;j++){
         //         if(nums[i]==nums[j] && Math.abs(i-j)<=k){
         //             return true;
         //         }
         //     }
         // }
        // int x = Math.abs(0);
        // System.out.println(x+"SEE ME");
        
        HashMap<Integer,Integer> hm = new HashMap<>();
         for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])==false){
                hm.put(nums[i],i);
            }else{
                int j = hm.get(nums[i]);
                if(Math.abs(i-j)<=k){   
                    return true;
                }hm.put(nums[i],i);
            }
         }
        return false;
    }
}