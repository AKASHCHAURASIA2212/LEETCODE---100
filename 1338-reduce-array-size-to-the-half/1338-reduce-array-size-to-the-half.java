class Solution {
    public int minSetSize(int[] arr) {
        int half = arr.length / 2;
        int result = 0;
        int fi = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: arr){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        List<Integer> frequency = new ArrayList<>();
        for(Integer i : hm.keySet()){
            frequency.add(hm.get(i));
        }
        
        Collections.sort(frequency, Collections.reverseOrder());
        for(int i: frequency){
            fi++;
            result += i;
            if(result >= half) break;
        }
        
        
        return fi;
    }
}