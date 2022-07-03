class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx=0;
        for(int i=0;i<s.length();i++)
        {
            char c1 = s.charAt(i);
             boolean flag=false;
            for(int j=idx;j<t.length();j++)
            {
                char c2 = t.charAt(j);
                
                if(c1==c2)
                {
                    idx=j+1;
                    flag=true;
                    break;
                }
            }
            if(!flag)return false;
        }
        
        return true;
    }
}