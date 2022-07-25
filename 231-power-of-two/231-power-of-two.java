class Solution {
    
//     public boolean isPower(int p,int n)
//     {
//         int mynum =(int) Math.pow(2,p);
        
//         if(mynum==n)
//         {
//             return true ; 
//         }
//         else if(mynum>n)
//         {
//             return false ;
//         }
//         else
//         {
//             return isPower(p+1,n);
//         }
//     }
//     public boolean isPowerOfTwo(int n) {
        
//         if(n==Integer.MAX_VALUE)
//         {
//             return false ;
//         }
//         return isPower(0,n);
//     }
    
      public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}