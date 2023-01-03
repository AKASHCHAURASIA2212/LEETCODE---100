class Solution {
    public int minDeletionSize(String[] strs) {
        boolean[] vis = new boolean[strs[0].length()];
        int count = 0;
        for(int i=0;i<strs.length-1;i++){
            String curr = strs[i];
            String next = strs[i+1];
            int len = curr.length();
            for(int j=0;j<len;j++){
                if(vis[j]==false){
                    if(curr.charAt(j)>next.charAt(j)){
                        vis[j]=true;
                        count++;
                    }
                }
            }
            
            if(count==len){
                break;
            }
        }
        
        return count;
        
        
    }
}