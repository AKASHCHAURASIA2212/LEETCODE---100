class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<jewels.length();i++)
        {
            char ch = jewels.charAt(i);
            if(!hs.contains(ch))
            {
               hs.add(ch);
            }
        }
        
        int count = 0 ;
        
            for(int i=0;i<stones.length();i++)
        {
            char ch = stones.charAt(i);
            if(hs.contains(ch))
            {
               count++;
            }
        }
        return count;
        
    }
}