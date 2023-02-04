class Solution {
    public void display(String[] arr){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"<-->");
    }
    System.out.println();
    
    }
    public int numDifferentIntegers(String word) {
       word = word.replaceAll("[abcdefghijklmnopqrstuvwxyz]", ",");
        String[] str = word.split(",");
        // System.out.println(word);
        // System.out.println(word);
        // display(str);
        if(str.length==1 && str[0].length()>0){
            return 1;
        }
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<str.length;i++){
            if(str[i].length()>0){
                String temp = str[i];
                while(temp.length()>0 && temp.charAt(0)=='0'){
                    temp = temp.substring(1);
                }
                
                hs.add(temp);
            }
        }

        return hs.size();
        
    }
}