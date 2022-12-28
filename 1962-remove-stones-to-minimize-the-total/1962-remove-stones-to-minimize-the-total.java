class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : piles){
            pq.add(x);
        }
        int n = piles.length;
        for(int i=k;i>0;i--){
            int val = pq.remove();
            
            
            // System.out.println(val);
            int newVal = (int)Math.ceil(val/2.0);
            pq.add(newVal);
            
            
        }
        
        int sum=0;
        while(pq.size()>0){
            int val = pq.remove();
            sum+=val;
        }
        
        return sum;
    }
}