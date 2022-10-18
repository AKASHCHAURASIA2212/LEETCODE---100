class Solution {
    public String code[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        
        String rstr = countAndSay(n-1);
         System.out.println(rstr);
        String myAns = "";
        int count=1;
        for(int i=0;i<rstr.length();i++){
            char x = rstr.charAt(i);
            if(i==rstr.length()-1){
                myAns+=count+""+x;
                count=1;
            }
            else if(x==rstr.charAt(i+1)){
                count++;
            }
            else{
                myAns+=count+""+x;
                // System.out.println(myAns);
                count=1;
            }
        }
        System.out.println(myAns);
        return myAns;
        
    }
}