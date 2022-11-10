class Solution {
    public String removeDuplicates(String s) {
        // StringBuilder sb = new StringBuilder(s);
        String sb = s ;

        Stack<Character> st = new Stack();
      
            for(int i=0;i<sb.length();i++){
                if(st.empty()){
                    st.push(sb.charAt(i));
                }
               else if(st.peek()==sb.charAt(i)){
                   st.pop();
               }
               else{
                   st.push(sb.charAt(i));
               }
            }

            // StringBuilder ans = new StringBuilder();
            String ans = "" ;
            while(st.empty()==false){
                Character ch = st.pop();
                ans = ch + ans ;
                
            }
        return ans ;
        
    }
}