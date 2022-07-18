class Solution {
    
      static String[] morscode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        
      
        
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<words.length;i++)
        {
           String str = words[i];
            String mors = "";
            for(int j=0;j<str.length();j++)
            {
                char ch = str.charAt(j);
                String code = morscode[ch-97];
                mors+=code ;
            }
            System.out.println("i-->"+i+" mors-->"+mors);
            hs.add(mors);
        }
        
        return hs.size();
    }
}