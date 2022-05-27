class Solution {
    public long arrTonum(int[] arr)
    {
        long sum=0;
        long pow = 1;
        for(int i =arr.length-1;i>=0;i--)
        {
            int temp = arr[i];
            // System.out.println("temp-->"+temp);
            sum+=temp*pow;
            // System.out.println("sum-->"+sum);
            pow*=10;
        }
        System.out.println("sum-->"+sum);
        return sum;
    }
    public int[] numToarr(long num)
    {
        int digit = 0;
        long temp = num;
        while(temp!=0)
        {
            digit++;
            temp/=10;
        }
        System.out.println("digit-->"+digit);
        
        int[] myans = new int[digit];
        for(int i = digit-1;i>=0;i--)
        {
            long rem = num%10;
            System.out.println("rem-->"+rem);
            num/=10;
            myans[i]=(int)rem;
        }
        return myans;
    }
    
    public int[] carryArr(int[] arr)
    {
      int[] myarr = new int[arr.length+1];
        myarr[0]=1;
        
        for(int i=1;i<myarr.length;i++)
        {
            myarr[i]=arr[i-1];
        }
        return myarr;
    }
    public int[] plusOne(int[] digits) {
        
        int len = digits.length;
        if(digits[len-1]!=9)
        {
          digits[len-1]=digits[len-1]+1;
            return digits;
        }
        
        // long num = arrTonum(digits);
        // num++;
        // System.out.println("num-->"+num);
        // int[] ans = numToarr(num);
        // return ans;
        
        int carry = 1;
        // int[] arr = new int[len];
        // int len2 = arr.length;
        for(int i = len-1 ; i>=0;i--)
        {
            if(digits[i]+carry>9)
            {
            digits[i]=0;
            carry=1;  
            }
            else
            {
                digits[i]=digits[i]+carry;
                carry=0;
            }
          
        }
        
        if(carry!=0)
        {
          int[] ans = carryArr(digits);
            return ans;
        }
        
        
        return digits;
        
    }
}