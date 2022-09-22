class Solution {
    public String revWords(String str){
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        return sb.toString();
    }
    public String reverseWords(String s) {
        String[] dummy = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<dummy.length;i++){
            ans.append(revWords(dummy[i]));
            if(i!=dummy.length-1)
                ans.append(" ");
        }
        return ans.toString();
        
      
    }
}