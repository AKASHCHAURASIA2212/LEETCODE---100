class Solution {
    
    public int countblank(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)==' ')
          {
              count++;
          }
        }
        return count;
    }
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++)
        {
            String str = sentences[i];
            
            int blank = countblank(str);
            
            if(blank>max)
            {
              max = blank;
            }
        }
        
        return max+1;
    }
}