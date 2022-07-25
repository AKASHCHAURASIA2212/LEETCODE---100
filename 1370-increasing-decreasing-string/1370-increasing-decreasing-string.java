class Solution {
    public String sortString(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!hm.containsKey(s.charAt(i)))
            {
               hm.put(s.charAt(i),1);
            }
           else
            {
              hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        
        boolean temp =true ;
        StringBuilder ans = new StringBuilder();
        while(temp)
        {
            temp=false ;
            for(int i=97;i<=122;i++)
            {
                if( hm.containsKey((char)i) && hm.get((char)i)!=0)
                {
                     ans.append((char)i);
                    hm.put((char)i,hm.get((char)i)-1);
                    temp=true;
                }
            }
            
            for(int i=122;i>=97;i--)
            {
                if( hm.containsKey((char)i) && hm.get((char)i)!=0)
                {
                 ans.append((char)i);
                 hm.put((char)i,hm.get((char)i)-1);
                    temp=true;
                }
            }
        }
        
        return ans.toString();
    }
        
}