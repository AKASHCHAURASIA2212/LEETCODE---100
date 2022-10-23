class Solution {
    public int[] findErrorNums(int[] nums) {
        // ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])==false){
                hm.put(nums[i],1);
            }else{
                int val = hm.get(nums[i]);
                hm.put(nums[i],val+1);
            }
        }
        System.out.println(hm);
        int key = 0 , value = 0 ;
        for(int i=1;i<=nums.length;i++){
            if(hm.containsKey(i)==false){
                key = i;
            }
            
            if(hm.get(i)!=null && hm.get(i)==2){
                value=i;
            }
        }
        // int[] myans = new int[al.size()];
        int myans[] = new int[2];
        myans[0]=value;
        myans[1]=key;
        return myans ;
    }
}