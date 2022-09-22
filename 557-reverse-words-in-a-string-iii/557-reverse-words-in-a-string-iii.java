class Solution {
    public String reverse(String str){
        String rev="";
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }
        return rev ;
    }
    public String reverseWords(String s) {
        String[] dummy = s.split(" ");
        String ans = "";
        for(int i=0;i<dummy.length;i++){
            ans+=reverse(dummy[i])+" ";
        }
        return ans.substring(0,ans.length()-1);
    }
}