class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> hm = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            
            char ch = s.charAt(i);
            hm.put(indices[i],ch);
        }
        
        String ans = "";
        
        for(int i=0;i<s.length();i++)
        {
            ans+=hm.get(i);
        }
        return ans ;
    }
}