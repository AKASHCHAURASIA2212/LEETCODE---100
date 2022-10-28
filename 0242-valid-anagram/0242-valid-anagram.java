class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch))
            {
                int val = hm.get(ch);
                hm.put(ch,val+1);
            }else{
                hm.put(ch,1);
            }
        }
        // System.out.println(hm);
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(hm.containsKey(ch))
            {
                int val = hm.get(ch);
                
                if(val==1){
                    hm.remove(ch);
                    continue;
                }
                hm.put(ch,val-1);
            }else{
                return false;
            }
        }
           // System.out.println(hm);
        
        return hm.size()==0?true:false;
    }
}