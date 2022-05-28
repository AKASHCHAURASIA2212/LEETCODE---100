class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        for(int i = 0  ; i < nums.length ; i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        System.out.println(hm);
        
        for(Integer Key : hm.keySet())
        {
          int val = hm.get(Key);
            
            hm2.put(val,Key);
        }
        
        return hm2.get(1);
    }
}