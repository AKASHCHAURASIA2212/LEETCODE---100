
class Solution {
    
    public int BinSerch(int[] arr,int tar)
    {
        int li=0;
        int ri=arr.length-1;
        
        while(li<=ri)
        {
            int mid = (ri+li)/2;
            
            if(arr[mid]==tar)
            {
                return mid;
            }
            else if(arr[mid]>tar)
            {
               ri=mid-1;
            }
            else
            {
                li=mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return BinSerch(nums,target);
    }
}