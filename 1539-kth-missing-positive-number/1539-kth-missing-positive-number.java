class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int x :arr){
            set.add(x);
        }
        System.out.println(set);
        int i=1;
        int lastNotContain = 1;
        while(k>=1){
            if(set.contains(i)==false){
                lastNotContain=i;
             k--;
            }
            i++;
        }
        
        return lastNotContain;
    }
}