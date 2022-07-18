class Solution {
    public String defangIPaddr(String address) {
        String s1 = address.replace("."," ");
        String[] str = s1.split(" ");
        
        String ans = "";
        System.out.println(str.length);
        for(int i=0;i<str.length;i++)
        {
            ans+=str[i];
            if(i<str.length-1)
            {
              ans+="[.]";
            }
        }
        return ans ; 
    }
}