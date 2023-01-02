class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str  = s.split(" ");
        
        HashMap<Character,String> hm = new HashMap<>();
        if(str.length!=pattern.length())return false;
        
        for(int i=0;i<pattern.length();i++){
            char key = pattern.charAt(i);
            String value = str[i];
            
            if(hm.containsKey(key)==false){
                if(hm.containsValue(value)){
                    return false;
                }
                hm.put(key,value);
            }else{
                String preValue = hm.get(key);
                if(preValue.equals(value)==false){
                    return false;
                }
                hm.put(key,value);
            }
        }
        return true;
    }
}