class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m = matrix[0].length;
        int minr=0,minc=0;
        int maxr=n-1,maxc=m-1;
        int count=0;
        ArrayList<Integer> al = new ArrayList<>();
        int lim = m*n;
        while(count<m*n){
            
            for(int i=minc ;i<=maxc && count<lim;i++){
                al.add(matrix[minr][i]);
                count++;
                // System.out.println(count);
            }
            minr++;
            
           for(int i=minr ;i<=maxr && count<lim;i++){
                al.add(matrix[i][maxc]);
                count++;
                 // System.out.println(count);
            }
            maxc--;
            
            for(int i=maxc ;i>=minc && count<lim;i--){
                al.add(matrix[maxr][i]);
                 count++;
                  // System.out.println(count);
            }
            maxr--;
            
            for(int i=maxr ;i>=minr && count<lim;i--){
                al.add(matrix[i][minc]);
                 count++;
                  // System.out.println(count);
            }
            minc++;
        }
          // System.out.println(count);
        return al ;
       
    }
}