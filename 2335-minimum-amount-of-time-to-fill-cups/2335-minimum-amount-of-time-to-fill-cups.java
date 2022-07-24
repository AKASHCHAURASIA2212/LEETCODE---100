
  class Solution {
    public int fillCups(int[] amount) {
        
        int seconds = 0;
        
        Arrays.sort(amount);
        
        int max1 = 2;
        
        int max2 =1;
        
    
        while (amount[max1]>0 && amount[max2]>0){
            
            amount[max1]--;
            amount[max2]--;
            seconds++;
            Arrays.sort(amount);
            
        }

        return seconds+amount[max1];
    }

}