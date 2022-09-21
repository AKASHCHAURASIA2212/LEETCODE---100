// class Solution {
//     public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
//          int[] ans = new int[nums.length] ;
//          for(int i=0;i<nums.length;i++){
//                int val = queries[i][0];
//                int idx = queries[i][1];
//              int sum=0;
//              for(int j=0;j<nums.length;j++){
//                    if(j==idx){
//                        nums[idx]+=val;
                       
//                        if(nums[idx]%2==0){
//                            sum+=nums[idx];
//                        }
//                    }else if(nums[j]%2==0){
//                        sum+=nums[j];
//                    }
//              }
//              ans[i]=sum;
//          }
//         return ans ;
//     }
// }
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int c=0; //counter variable for the array 
        int[] arr=new int[nums.length];
        int tempval=0; //to store the values of the queries
        int ind=0;
        int sum=0; //store the sum of the even elements
        for(int j=0;j<nums.length;j++)  //finding the sum of the even elements in the beginning 
        {
            if(nums[j]%2==0)
                sum=sum+nums[j];
        }
        for(int i =0;i<queries.length;i++)
        {
            tempval=queries[i][0];
            ind=queries[i][1];
            if(nums[ind]%2==0)
                sum=sum-nums[ind];

            nums[ind]=nums[ind]+tempval;
            
            if(nums[ind]%2==0)
                sum=sum+nums[ind];
            
            arr[c++]=sum;
        }
        return arr;
    }
}