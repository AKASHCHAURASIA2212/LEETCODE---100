class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] ans = new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int row = rowSum[i];
                int col = colSum[j];
                
                int min = Math.min(row,col);
                
                ans[i][j] = min ; 
                
                if(min==rowSum[i])
                {
                    rowSum[i] = rowSum[i]-min ;
                    colSum[j]= colSum[j]-min ;
                }
                else if(min==colSum[j])
                {
                    colSum[j] = colSum[j]-min ;
                    rowSum[i] = rowSum[i]-min ;
                }
            }
        }
        
        return ans ;
    }
}