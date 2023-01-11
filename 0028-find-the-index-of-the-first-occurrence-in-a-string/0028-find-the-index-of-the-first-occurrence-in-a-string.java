class Solution {
    public int strStr(String haystack, String needle) {
        
        // naive based string mathing algo
        
        int n = haystack.length();
        int m = needle.length();
        
        for(int s=0;s<=n-m;s++){
            boolean temp = false;
            for(int i=0;i<m;i++){
                if(needle.charAt(i)!=haystack.charAt(s+i)){
                    temp = true;
                    break;
                }
            }
            
            if(temp==false)return s;
        }
        
        return -1;
    }
}