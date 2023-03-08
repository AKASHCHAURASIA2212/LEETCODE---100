class Solution {
    
    public boolean isSpeedOk(int arr[] ,int h ,int myhour){
        int count=0;
        
        for(int val : arr){
            int rem = val/myhour;
            count+=rem;
            if(val%myhour!=0){
                count++;
            }
        }
        System.out.println("MS-> "+myhour+" count-> "+count);
        return count<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxpile = Integer.MIN_VALUE;
        
        for(int banana :piles){
            maxpile = Math.max(banana,maxpile);
        }
        System.out.println("Maxpile "+maxpile);
        
        int l = 1;
        int r = maxpile;
        
        while(l<r){
            int myspeed = (l+r)/2;
            if(isSpeedOk(piles,h,myspeed)){
                r = myspeed;
            }else{
                l = myspeed+1;
            }
        }
        
        return l ;
    }
}