class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> st = new Stack();

        for(int i=0;i<nums.length;i++){
            if(st.empty()){
                st.push(nums[i]);
            }else if(st.peek()!=nums[i]){
                st.push(nums[i]);
            }
        }
        int ans = st.size();
      int j=ans-1;
      while(st.empty()==false){
          nums[j]=st.pop();
          j--;
      }

      return ans;
    }
}