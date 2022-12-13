class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int n = matrix.length;
        
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n;j++){
                int row = i,col = j;
                
                int myvalue = matrix[i][j];
                if(col==0){
                    myvalue+=Math.min(matrix[i+1][j],matrix[i+1][j+1]);
                }else if(col==n-1){
                    myvalue+=Math.min(matrix[i+1][j],matrix[i+1][j-1]);
                }else{
                    myvalue+=Math.min( Math.min(matrix[i+1][j],matrix[i+1][j+1]) , matrix[i+1][j-1]);
                }
                
                matrix[i][j] = myvalue;
            }
        }
        int ans = matrix[0][0];
        for(int j=1;j<n;j++){
            if(matrix[0][j]<ans){
                ans=matrix[0][j];
            }
        }
        
        return ans ;
    }
}