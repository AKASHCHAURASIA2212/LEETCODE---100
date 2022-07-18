class Solution {
    public String interpret(String command) {
        String s1 = command.replace("()","*");
         s1 = s1.replace("(al)","#");
        
        String ans = "" ;
        
        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            
            if(ch=='G')
            {
                ans+="G";
            }
            else if(ch=='#')
            {
               ans+="al";
            }
            else if(ch=='*')
            {
               ans+="o";
            }
        }
        
        return ans ;
    }
}