class Solution {
    
    public int BinSearch(int[] nums,int target)
    {
         int i = 0 ;
         int j = nums.length-1;
         
        int premid = 0;
        int mid = 0;
        while(i<=j)
        {
            
            mid = (i+j)/2;
            premid = mid;
            System.out.println("mid-->"+mid);
            System.out.println("premid-->"+premid);
            
            if(nums[mid]==target)
            {
               return mid;
            }
            else if(nums[mid]<target)
            {
                  i=mid+1;
            }
            else
            {
                 j=mid-1;
            }
        }
        
        return premid;
    }
    public int searchInsert(int[] nums, int target) {
        int idx = BinSearch(nums,target);
//         // System.out.println("temp1-->"+temp1);
//         if(temp1==-1)
//         {
//           int temp2 = BinSearch(nums,target-1);
//            // System.out.println("temp2-->"+temp2);
//              if(temp2!=-1)
//             {
//                 return temp2+1;
//             }
            
//           int temp3 = BinSearch(nums,target+1); 
//         // System.out.println("temp3-->"+temp3);

//             if(temp3!=-1)
//             {
//                   return temp3;
//             }
//         }
        if(nums[idx]==target)
        {
            return idx;
        }
        if(nums[idx]>target)
        {
          return idx;
        }
        return idx+1;
        
    }
}