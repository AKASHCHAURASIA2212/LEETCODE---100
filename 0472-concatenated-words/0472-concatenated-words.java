class Solution {
    
    public boolean isConcatenated(String str,HashSet<String> hs){
        int l = str.length();
        for(int i=0;i<l;i++){
            String prefix = str.substring(0,i+1);
            String suffix = str.substring(i+1);
            
            if(hs.contains(prefix) && isConcatenated(suffix,hs) || hs.contains(prefix) && hs.contains(suffix)){
                return true;
            }            
        }
        return false;
    }
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashSet<String> hs = new HashSet<>();
        List<String> result = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            hs.add(words[i]);
        }
        
        for(int i=0;i<words.length;i++){
            if(isConcatenated(words[i],hs)){
                result.add(words[i]);
            }
        }
        
        return result;
    }
}