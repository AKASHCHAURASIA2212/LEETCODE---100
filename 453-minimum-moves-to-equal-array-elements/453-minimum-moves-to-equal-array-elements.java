class Solution {
    public int minMoves(int[] nums) {
        
        int move = 0 ; 
        
        int min = Integer.MAX_VALUE ;
        for(int i=0;i<nums.length;i++)
        {
           if(min>nums[i])
           {
               min = nums[i];
           }
        }
        
        for(int i=0;i<nums.length;i++)
        {
           move+=nums[i]-min;
        }
        
        return move ; 
        
    }
}