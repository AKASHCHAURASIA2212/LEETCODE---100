class Solution {
//     public int partitionDisjoint(int[] nums) {
        
//         int min[] = new int[nums.length];
        
//         int max[] = new int [nums.length];
        
//         int n = nums.length;
        
//         min[n-1]=nums[n-1];
            
//         for(int i = n-2 ; i>=0 ;i--)
//         {
//             min[i] = Math.min(nums[i],min[i+1]);
//         }
        
//         max[0]=nums[0];
            
//         for(int i =1; i<n ;i++)
//         {
//             max[i] = Math.max(nums[i],max[i-1]);
//         }
        
        
//         for(int i=0;i<n-1;i++)
//         {
            
//             if(max[i]<=min[i+1] && nums[i]<=max[i])
//             {
//                 return i+1;
//             }
//         }
        
//         return -1 ;
//     }
    
    public int partitionDisjoint(int[] nums) {
        
        int mtp=nums[0];
        
        int mts=nums[0];
        
        int idx=0;
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]<mtp){
                
                idx=i;
                
                mtp=mts;
                
            }else{
                
                mts=Math.max(mts,nums[i]);
                
            }
        }
        return idx+1;
    }

}