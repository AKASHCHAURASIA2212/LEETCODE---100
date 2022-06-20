class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        if(s.length()!=t.length())return false;
        
        for(int i=0;i<s.length();i++)
        {
           
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);
            
            if(hm.containsKey(s1))
            {
                //some work
                char rem = hm.get(s1);
                if(s2!=rem)
                {
                    return false;
                }
            }
            else
            {
               
                hm.put(s1,s2);
            
            }
        }
        
        hm.clear();
        for(int i=s.length()-1;i>=0;i--)
        {
           
            char s1 = t.charAt(i);
            char s2 = s.charAt(i);
            
            if(hm.containsKey(s1))
            {
                //some work
                char rem = hm.get(s1);
                if(s2!=rem)
                {
                    return false;
                }
            }
            else
            {
               
                hm.put(s1,s2);
            
            }
        }
        return true;
    }
}