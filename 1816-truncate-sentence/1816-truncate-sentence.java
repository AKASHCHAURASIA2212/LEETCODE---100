class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        
        String ans  = "" ;
        
        for(int i=0;i<k;i++)
        {
            ans+=str[i];
            if(i!=k-1)
            {
                ans+=" ";
            }
        }
        
        return ans ; 
    }
}