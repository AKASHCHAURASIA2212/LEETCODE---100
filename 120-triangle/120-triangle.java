class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
         Integer n = triangle.size();
        for( Integer i = n-2;i>=0;i--)
        {
            int m = triangle.get(i).size()+1;
            for( Integer j = 0 ; j<m-1;j++)
            {
                Integer curr = triangle.get(i).get(j);
                 Integer op1 = triangle.get(i+1).get(j);
                 Integer op2 = triangle.get(i+1).get(j+1);
                
                if(curr+op1<curr+op2)
                {
                    curr=curr+op1;
                }
                else
                {
                   curr=curr+op2;
                }
                
                triangle.get(i).set(j,curr);  
            }
        }
        
        return triangle.get(0).get(0);
    }
}