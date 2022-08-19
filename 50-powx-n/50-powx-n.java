class Solution {
    public double myPow(double x, int n) {
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        if (n == 0) return 1;
        if (x == 1) return x;
        
        return pow(1, x, n);
    }
    
    double pow(double result, double x, int n) {
        if (n == 0) return result;
        if (n % 2 != 0) result *= x;
        return pow(result, x*=x , n/=2);
    }
}