class Solution {
    
    public boolean valid(String str,HashSet<Character> hs)
    {
        for(int i=0;i<str.length();i++)
        {
            if(!hs.contains(str.charAt(i)))
            {
              return false;
            }
        }
        return true;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<allowed.length();i++)
        {
            hs.add(allowed.charAt(i));
        }
        
        int count=0;
        for(int j=0;j<words.length;j++)
        {
            String str = words[j];
            
            if(valid(str,hs))
            {
                count++;
            }
        }
        
        return count;
    }
}