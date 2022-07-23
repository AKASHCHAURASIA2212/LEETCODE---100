class Solution {
    public String truncateSentence(String s, int k) {
        // String[] str = s.split(" ");
        
        String ans  = "" ;
        
        // for(int i=0;i<k;i++)
        // {
        //     ans+=str[i];
        //     if(i!=k-1)
        //     {
        //         ans+=" ";
        //     }
        // }
        
        int csp = 0  ;
        for(int i=0;i<s.length();i++)
        {
           char ch = s.charAt(i);
            
            if(ch==' ')
            {
                csp++;
            }
            
            if(csp==k)
            {
                ans = s.substring(0,i);
                break;
            }
        }
        
        if(csp<k)
        {
            return s;
        }
        
        return ans ; 
    }
}