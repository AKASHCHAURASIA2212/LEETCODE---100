class Solution {

    public boolean isPower(int p,int n)
    {
        int mynum =(int) Math.pow(3,p);
        
        if(mynum==n)
        {
            return true ; 
        }
        else if(mynum>n)
        {
            return false ;
        }
        else
        {
            return isPower(p+1,n);
        }
    }
    public boolean isPowerOfThree(int n) {
        
        if(n==Integer.MAX_VALUE)
        {
            return false ;
        }
        return isPower(0,n);
    }
    
    }
