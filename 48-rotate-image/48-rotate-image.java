class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        
        int row = n-1 ;
        int col = 0 ;
        int i=row;
        int j=col;
        int count = 0;
        while(row>=n/2){
            if(i>=col && j<=row){
                int tmp = matrix[row][j];
                matrix[row][j] = matrix[i][col];
                matrix[i][col]=tmp ; 
                i--;
                j++;
            }
            else{
                row--;
                col++;
                i=row;
                j=col;
            } 
        }
        
        
        row = 0 ;
        col = n-1 ;
        i=col ; j=row ;
           while(row<n/2){
               
            if(i>row && j<col){
                
                int tmp = matrix[row][i];
                matrix[row][i] = matrix[j][col];
                matrix[j][col]=tmp ; 
                i--;
                j++;
            }
            else{
                row++;
                col--;
                i=col;
                j=row;
            } 
        }
        int k = n-1 ;
        for(int x=0;x<n/2;x++){
            for(int y=0;y<n;y++){
                int temp = matrix[x][y];
                matrix[x][y] = matrix[k][y];
                matrix[k][y] = temp ;   
            }
            k--;
        }
    }
}