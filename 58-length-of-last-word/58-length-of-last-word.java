class Solution {
    public int lengthOfLastWord(String s) {
      
       String[] str = s.split(" ");
        for(String s1 : str)
        {
           System.out.print(s1+" ");
        }
        return str[str.length-1].length();
    }
}