class Solution {
    
    public void treverse(int[][] grid,int i,int j,int orgclr,boolean[][] vis)
    {
          if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || vis[i][j]==true || grid[i][j]!=orgclr)
          {
              return;
          }
        vis[i][j]=true;
        grid[i][j]=-1;
        
         treverse(grid,i-1,j,orgclr,vis);
         treverse(grid,i+1,j,orgclr,vis);
         treverse(grid,i,j-1,orgclr,vis);
         treverse(grid,i,j+1,orgclr,vis);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int myclr = image[sr][sc] ; 
        
        boolean[][] vis = new boolean[image.length][image[0].length];
        
        treverse(image,sr,sc,myclr,vis);
        
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                if(image[i][j]==-1){
                    image[i][j]=color;
                }
            }
        }
        
        return image;
    }
}