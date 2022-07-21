class Solution {
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int i=0;
        int j = str.length()-1;
        while(i<j)
        {
   
            
            while(i<j && "aeiouAEIOU".indexOf(str.charAt(i)+"")==-1)
            {
                i++;
            }
            
            while(i<j && "aeiouAEIOU".indexOf(str.charAt(j)+"")==-1)
            {
                j--;
            }
            
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            
            str.setCharAt(i,ch2);
            str.setCharAt(j,ch1);
            i++;
            j--;
            
        }
        
        return str.toString();
    }
}