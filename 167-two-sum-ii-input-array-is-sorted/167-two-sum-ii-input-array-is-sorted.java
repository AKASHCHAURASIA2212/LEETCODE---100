class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int ans[] = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            hm.put(numbers[i],i);
        }
        
        for(int i=0;i<numbers.length;i++)
        {
            int newtarget = target-numbers[i];
            if(hm.containsKey(newtarget))
            {
                ans[0]=i+1;
                ans[1]=hm.get(newtarget)+1;
                return ans;
            }
        }
        
        return ans;
    }
}