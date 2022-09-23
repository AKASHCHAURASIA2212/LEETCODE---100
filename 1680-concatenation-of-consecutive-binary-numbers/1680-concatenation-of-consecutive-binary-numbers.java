class Solution {
    public int concatenatedBinary(int n) {
        long ans = 0 ;
         for(int i=1;i<=n;i++){
        String bin = Integer.toBinaryString(i);
        int binlen = bin.length();
        
        ans = ans<<binlen;
        ans = ans | i; //we can do '+' also
        ans %= 1000000007;
    }
    
    return (int)ans%1000000007;
}
}
