class Solution {
    public List<Integer> partitionLabels(String s) {
        
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(!hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),i);
            }
            else
            {
                 hm.put(s.charAt(i),i);
            }
        }
        
        int st = 0;
        int end =0 ;
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            
            end = Math.max(hm.get(ch),end);
            // System.out.println(end);
            if(i==end)
            {
                li.add(end-st+1);
                end = st = i+1 ;
            }
            
        }
        
        return li ;
    }
}