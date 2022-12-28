class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] ncap = new int[rocks.length];
        
        for(int i=0 ; i<rocks.length ; i++){
            ncap[i] = capacity[i]-rocks[i];
        }
        
        Arrays.sort(ncap);
        
        for(int i=0 ; i<rocks.length ; i++){
            if(additionalRocks>=ncap[i] && ncap[i]!=0){
                additionalRocks-=ncap[i];
                ncap[i]=0;
            }
            
            if(additionalRocks<=0){
                break;
            }
        }
        
        int count =0 ;
        for(int i=0 ; i<rocks.length ; i++){
            if(ncap[i]==0)
                count++;
        }
        
        return count;
        
        
        
    }
}