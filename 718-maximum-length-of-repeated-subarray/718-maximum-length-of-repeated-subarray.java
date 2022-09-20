class Solution {
public int findLength(int[] nums1, int[] nums2) {
         int ans =0;
        for(int i =0 ; i<nums1.length ; i++){
            int count =0;
            int n = nums2.length;
            for(int j =0 ; j<n ; j++){
                count=0;
                if(nums1[i]==nums2[j]){
                    int a = i;
                    int b = j ;
                while(a<nums1.length && b<nums2.length && nums1[a]==nums2[b]){
                    a++;
                    b++;
                    count++;
                }
                ans = Math.max(ans, count);
                }
            }
            if(ans>=(nums1.length-i)){
                break;
            }
        }
        
        return ans;
    }
};