public class Main {
    class Solution {
    
        public void transferToleft(int[] arr,int idx)
           {
               
               int len = arr.length;
               int limit = -1;
               for(int i = idx ; i < len-1 ; i++)
               {
                   if(arr[i]==limit)
                   {
                     return;
                   }
                   arr[i]=arr[i+1];
               }
               arr[len-1]=limit;
           }
       
       public int removeElement(int[] nums, int val) {
           
           int len = nums.length;
           int count = 0 ; 
           int limit = -1;
           for(int i = 0 ; i < len ; i++)
           {
               while(nums[i]==val && nums[i]!=limit)
               {
                  transferToleft(nums,i);
                   count++;
               }
           }
           
           return len-count;
       }
   }
}
