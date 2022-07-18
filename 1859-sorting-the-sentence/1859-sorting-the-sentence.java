class Solution {
    public String sortSentence(String str2) {
        String[] str = str2.split(" ");
        
        HashMap<Integer,String> hm = new HashMap<>();
        
        for(int i=0;i<str.length;i++)
        {
            String s = str[i];
            char ch = s.charAt(s.length()-1);
            int idx = ch-'0';
            s = s.replace(ch+"","");
            hm.put(idx,s);
        }
        
        String ans = "" ;
        for(int i=0;i<str.length;i++)
        {
            ans+=hm.get(i+1);
            if(i<str.length-1)
            {
                ans+=" ";
            }
        }
        
        return ans ; 
    }
}