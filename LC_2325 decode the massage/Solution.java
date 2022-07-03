class Solution {
    public String decodeMessage(String key, String message) {
        boolean[] vis = new boolean[26];
        
        HashMap<Character,Character> hm = new HashMap<>();
        int idx = 97;
        for(int i=0;i<key.length();i++)
        {
           char ch = key.charAt(i);
            if(ch==' ')
            {
                continue;
            }
            if(!hm.containsKey(ch))
            {
                hm.put(ch,(char)idx);
                idx++;
            }
            
            if(hm.size()==26)
            {
               break;
            }
        }
        
        System.out.println(hm);
        
        String ans = "";
        
        for(int i=0;i<message.length();i++)
        {
            char ch = message.charAt(i);
            if(ch==' ')
            {
                ans+=ch;
            }
            else
            {
              char alp = hm.get(ch);
              ans+=alp;
            }
            
        }
        
        return ans;
    }
}