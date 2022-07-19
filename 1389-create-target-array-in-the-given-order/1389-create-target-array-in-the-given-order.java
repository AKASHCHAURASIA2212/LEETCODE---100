class Solution {
    public void shift(int[] arr,int idx)
    {
        for(int i=arr.length-1;i>idx;i--)
        {
            arr[i] = arr[i-1];
        }
    }
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] arr = new int[nums.length] ;
        Arrays.fill(arr,-1);
        for(int i=0;i<nums.length;i++)
        {
           if(arr[i]!=-1)
           {
               arr[index[i]] = nums[i] ;
           }
            else
            {
                shift(arr,index[i]);
                
                arr[index[i]] = nums[i];
            }
        }
        return arr ; 
    }
}