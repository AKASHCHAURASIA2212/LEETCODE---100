class Solution {
    public int firstUniqChar(String s) {
        int[] alp = new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            alp[ch-97]++;
        }
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(alp[ch-97]==1)
            {
                return i;
            }
        }
        return -1;
        
        
    }
}