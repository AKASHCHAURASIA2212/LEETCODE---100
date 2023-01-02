class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1)return true;
        boolean small = false;
        boolean big = false;
        boolean firstBig = false;
        boolean firstSmall = false;
        
        char ch = word.charAt(0);
        if(ch<=90 && ch>=65){
            firstBig = true;
        }
        else if(ch<=122 && ch>=97){
            firstSmall = true;
        }
        
        for(int i=1;i<word.length();i++){
            char x = word.charAt(i);
        
            if(x<=90 && x>=65){
                big = true;
            }
            else if(x<=122 && x>=97){
                small = true;
            }
            
        }
        
        if(small==false && firstSmall==false || firstBig==true && small==true && big==false || firstSmall==true && small==true && big==false ){
            return true;
        }
        
        return false;
    }
}