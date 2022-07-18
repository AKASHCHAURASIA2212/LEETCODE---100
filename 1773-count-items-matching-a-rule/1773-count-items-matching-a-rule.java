class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = -1 ; 
        
        if(ruleKey.equals("type"))
        {
            idx=0;
        }
        else if(ruleKey.equals("color"))
        {
            idx=1;
        }
        else if(ruleKey.equals("name"))
        {
            idx=2;
        }
        
        int count=0;
        for(int i=0;i<items.size();i++)
        {
            List<String> str = items.get(i);
            if(ruleValue.equals(str.get(idx)))
            {
                count++;
            }
        }
        return count;
    }
}