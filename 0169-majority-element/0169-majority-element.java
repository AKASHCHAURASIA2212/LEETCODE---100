class Solution {
    
    public int solve(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : arr) {
            if (hm.containsKey(x)) {
                hm.put(x, hm.get(x) + 1);
            } else {
                hm.put(x, 1);
            }
        }

        for (int elem : arr) {
            if (hm.get(elem) > arr.length / 2) {
                // System.out.println("Majority element --> " + elem);
                return elem;
        
            }
        }
        
        return -1;

    }
    public int majorityElement(int[] nums) {
        // return solve(nums);
        
        Arrays.sort(nums);
        return (nums[nums.length / 2]);
    }
}