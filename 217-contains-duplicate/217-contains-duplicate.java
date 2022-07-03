class Solution {
    
//     method 1 
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
        
//         for(int i=0;i<nums.length-1;i++)
//         {
//             if(nums[i+1]==nums[i])
//             {
//                 return true;
//             }
//         }
        
//         return false;
//     }
    
      public boolean containsDuplicate(int[] nums) {
          
          HashSet<Integer> hs = new HashSet<>();
          
          for(int i=0;i<nums.length;i++)
          {
             if(hs.contains(nums[i]))return true;
              else{
                  hs.add(nums[i]);
              }
          }
          
          return false;
      }

}