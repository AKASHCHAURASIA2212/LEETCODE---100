class Solution {
    public boolean check(String s1,String s2){
        int len = s2.length();
        int i=0;
        while(i<s1.length()){
            String test = s1.substring(i,len+i);
            if(test.equals(s2)==false){
                return false;
            }
            i+=len;
        }
        
        return true;
    }
    boolean temp = false;
    
    public int findgcd(int a,int b){
        if (a == 0)
            return b;
 
        return findgcd(b % a, a);
        
    }
    public String gcdOfStrings(String str1, String str2) {
        
        int len1 = str1.length();
        int len2 = str2.length();
        int len = findgcd(len1,len2);
        // System.out.println(gcd);
    
        String ans = str2.substring(0,len);
        
          if(check(str2,ans)){
                if(str1.contains(ans) && str1.length()%ans.length()==0){
                        if(check(str1,ans)){
                            return ans;
                        }
                }
            }
        return "";
    }
}