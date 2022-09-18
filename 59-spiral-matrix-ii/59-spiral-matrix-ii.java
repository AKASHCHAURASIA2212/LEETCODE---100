class Solution {
    public int[][] generateMatrix(int n ) {
        int matrix[][] = new int[n][n];
        int minr=0,minc=0;
        int maxr=n-1,maxc=n-1;
        int count=1;
        int lim = n*n;
        while(count<=n*n){
            
            for(int i=minc ;i<=maxc && count<=lim;i++){
                matrix[minr][i]=count;
                count++;
                // System.out.println(count);
            }
            minr++;
            
           for(int i=minr ;i<=maxr && count<=lim;i++){
                matrix[i][maxc]=count;
                count++;
                 // System.out.println(count);
            }
            maxc--;
            
            for(int i=maxc ;i>=minc && count<=lim;i--){
                matrix[maxr][i]=count;
                 count++;
                  // System.out.println(count);
            }
            maxr--;
            
            for(int i=maxr ;i>=minr && count<=lim;i--){
                matrix[i][minc]=count;
                 count++;
                  // System.out.println(count);
            }
            minc++;
        }
          // System.out.println(count);
        return matrix ;
       
    }
}