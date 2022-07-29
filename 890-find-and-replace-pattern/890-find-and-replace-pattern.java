class Solution {
    
    public boolean isValidPattern(String str ,String ptr)
    {
        
        if(str.length()!=ptr.length())
        {
           return false;
        }
        
        boolean vis[] = new boolean[26];
        HashMap<Character,Character> hm = new HashMap<>();
        
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!hm.containsKey(ch))
            {
                if(vis[ptr.charAt(i)-97]==false)
                {
                       hm.put(ch,ptr.charAt(i));
                    vis[ptr.charAt(i)-97]=true;
                }
             
            }
        }
        
        String ans = "" ; 
        
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            
            ans+=hm.get(ch);
        }
        
        if(ans.equals(ptr))
        {
            return true;
        }
        
        return false;
        
    }
    
    public List<String> findAndReplacePattern(String[] words, String pattern) {
          
        List<String> ans = new ArrayList<>();
        
        for(int i=0;i<words.length;i++)
        {
            String str = words[i];
            
            if( isValidPattern(str,pattern) )
            {
               ans.add(str);
            }
            
        }
        return ans ;
    }
}