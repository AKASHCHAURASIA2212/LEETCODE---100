class Solution {
    public int reachNumber(int target) {
        int ans =0 ;
        
        target = Math.abs(target);
         int i = 0 ;
        while(true)
        {
            ans = (i*(i+1))/2;
            
            if(ans >= target && target % 2== ans % 2)
            {
                return i;
            }
            i++;

        }
        
        // return -1 ;
        
    }
}