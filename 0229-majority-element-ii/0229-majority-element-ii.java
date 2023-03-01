class Solution {
    
    public ArrayList<Integer> solve(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        for (int x : arr) {
            hs.add(x);
            if (hm.containsKey(x)) {
                hm.put(x, hm.get(x) + 1);
            } else {
                hm.put(x, 1);
            }
        }
        
        ArrayList<Integer> li = new ArrayList<>();
        int limit = (int)Math.floor(arr.length/3);
        for (int elem : hs) {
            if (hm.get(elem) > limit) {
                // System.out.println("Majority element --> " + elem);
                li.add(elem);
        
            }
        }
        
        return li;

    }
    public List<Integer> majorityElement(int[] nums) {
        return solve(nums);
    }
}