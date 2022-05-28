class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = nums1.length-1;
        int j = nums2.length-1;
        
        while(n!=0)
        {
           nums1[i]=nums2[j];
            i--;
            j--;
            n--;
        }
        
        Arrays.sort(nums1);
        
        
    }
}