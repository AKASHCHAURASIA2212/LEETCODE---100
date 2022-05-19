package LC_26(remove Duplicate from sorted list);

public class Main {
    class Solution {
    
        public void transferToleft(int[] arr,int idx)
        {
            
            int len = arr.length;
            int limit = -150;
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
        public int removeDuplicates(int[] nums) {
            if(nums.length==1)
            {
               return 1; 
            }
            int len = nums.length;
            
            int limit = -150;
            
            for(int i = 1 ; i < len ; i++)
            {
                while(nums[i]==nums[i-1] && nums[i]!=limit)
                {
                    
                    transferToleft(nums,i);
                }
            }
            
            int k =len;
            
            for(int i = 0 ; i < len ;i++)
            {
              if(nums[i]==limit)
              {
                  return i;
              }
            }
            
            return k;
        }
    }
}
