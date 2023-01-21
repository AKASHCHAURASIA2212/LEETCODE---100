class Solution {
    
    public boolean isValid(String str){
        if(str.charAt(0)=='0' && str.length()>1){
            return false;
        }else if(Integer.parseInt(str)>=256){
            return false;
        }
        
        return true;
    }
    
    public void helper(String str,int i,int par,String ans,List<String> res){
        if(str.length()==i || par==4){
            if(str.length()==i && par==4){
                res.add(ans.substring(0,ans.length()-1));
            }
            
            return;
        }
        
        helper(str,i+1,par+1,ans+str.charAt(i)+".",res);
        
        
        if(i+2<=str.length() && isValid(str.substring(i,i+2))){
            helper(str,i+2,par+1,ans+str.substring(i,i+2)+".",res);
        }
        
        
         if(i+3<=str.length() && isValid(str.substring(i,i+3))){
            helper(str,i+3,par+1,ans+str.substring(i,i+3)+".",res);
        }
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        helper(s,0,0,"",ans);
        return ans;
    }
}