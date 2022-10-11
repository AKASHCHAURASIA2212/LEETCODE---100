// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         // naive approch
        
// //         for(int i=0;i<nums.length;i++){
// //             for(int j=i+1;j<nums.length;j++){
// //                 for(int k=j+1;k<nums.length;k++){
                    
// //                     if( nums[i]<nums[j] && nums[j]<nums[k] && i<j && j<k){
// //                         return true;
// //                     }
// //                 }
// //             }
// //         }
        
//         int count=1;
//         int x = nums[0];
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]>x){
//                 count++;
//                 x=nums[i];
//             }
//             else{
//                 x=nums[i];
//                 count=1;
//             }
            
//             if(count==3){
//                 return true;
//             }
//         }
//         return false;
//     }
// }


class Solution {
    public boolean increasingTriplet(int[] nums) {
       int max1 = Integer.MAX_VALUE;
       int max2 = Integer.MAX_VALUE;
       for(int n : nums) {
           if(n <= max1){
               max1 = n;
           }
           else if(n <= max2){
                max2 = n;
           }
           else{
               return true;
           }
       }
       return false;
    }
}