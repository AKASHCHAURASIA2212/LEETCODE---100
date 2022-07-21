class Solution {
    public int reverse(int x) {
         
         int sign = x<0?1:0 ; 
        
        int count = 0 ;
        if(sign==1)
        {
            x = x*(-1);
        }
        int temp = x ; 
        while(temp!=0)
        {
            count++;
            temp/=10;
        }
        temp=x;
        int ans=0;
        while(temp>0)
        {
            int rem = temp%10 ; 
            temp/=10 ; 
            ans+= rem * Math.pow(10,--count) ;
        }
        
        if(ans==Integer.MAX_VALUE)
        {
            return 0 ;
        }
        if(sign==1)
        {
            ans=ans*(-1);
        }
        
        return ans ; 
      
        
    }
}