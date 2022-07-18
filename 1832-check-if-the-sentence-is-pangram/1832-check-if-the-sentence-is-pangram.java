class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean[] vis = new boolean[26];
        
        for(int i=0;i<sentence.length();i++)
        {
            int idx = sentence.charAt(i)-97 ;
            vis[idx]=true;
        }
        
        for(boolean ele : vis)
        {
            if(!ele)
            {
                return false;
            }
        }
        
        return true;
    }
}