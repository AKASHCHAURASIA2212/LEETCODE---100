class Solution {
    
//      public boolean isAnagram(String s, String t) {
//         HashMap<Character,Integer> hm = new HashMap<>();
        
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if(hm.containsKey(ch))
//             {
//                 int val = hm.get(ch);
//                 hm.put(ch,val+1);
//             }else{
//                 hm.put(ch,1);
//             }
//         }
//         // System.out.println(hm);
//         for(int i=0;i<t.length();i++){
//             char ch = t.charAt(i);
//             if(hm.containsKey(ch))
//             {
//                 int val = hm.get(ch);
                
//                 if(val==1){
//                     hm.remove(ch);
//                     continue;
//                 }
//                 hm.put(ch,val-1);
//             }else{
//                 return false;
//             }
//         }
//            // System.out.println(hm);
        
//         return hm.size()==0?true:false;
//     }
    
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.length() == 0) return true;

        var letters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }

        for (int l : letters) {
            if (l != 0) return false;
        }

        return true;
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> list = new ArrayList<>();
        boolean[] vis = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(vis[i]==false){
                 String str1 = strs[i];
            List<String> li = new ArrayList<>();
            if(vis[i]==false){
                li.add(str1);
            }
            for(int j=i+1;j<strs.length;j++){
                String str2 = strs[j];
                if(isAnagram(str1,str2)){
                    li.add(str2);
                    vis[j]=true;
                }
            }
            if(li.size()>0){
                list.add(li);
            }
            }
        }
        return list ;
    }
}