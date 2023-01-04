class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            if(hm.containsKey(tasks[i])==false){
                hm.put(tasks[i],1);
            }else{
                hm.put(tasks[i],hm.get(tasks[i])+1);;
            }
        }
         Set<Integer> keys = hm.keySet();
         System.out.println(keys);
         System.out.println(hm);
        
       
        // check if any number occurs only one time
        for(Integer key : keys){
            if(hm.get(key)<=1){
                return -1;
            }
        }
        
        int count=0;
        
        for(Integer key : keys){
            int val = hm.get(key);
            int div = val/3;
            int mod = val%3;
            System.out.println("key--> "+key+" div--> "+div+" mod--> "+mod);
            count+=div;
            if(mod!=0){
                count++;
            }
        }
        
        return count;
    }
}