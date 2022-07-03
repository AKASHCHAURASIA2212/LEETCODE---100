class Solution {
    
    public void treverse(int[][] grid,int i,int j,boolean[][] vis)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || vis[i][j]==true || grid[i][j]==0)
        {
            return;
        }
        maxisland++;
        vis[i][j]=true;
        
         treverse(grid,i-1,j,vis);
         treverse(grid,i+1,j,vis);
         treverse(grid,i,j-1,vis);
         treverse(grid,i,j+1,vis);
    }
    
     static int maxisland = 0 ;
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        
       int mymax=0;
        for(int i=0 ; i< grid.length ; i++)
        {
            for(int j=0 ; j< grid[0].length ; j++)
            {
               if(grid[i][j]==1 && vis[i][j]==false)
               {
                   treverse(grid,i,j,vis);
                   mymax = Math.max(mymax,maxisland);
                   maxisland=0;
               }
            }
        }
        
        return mymax;
    }
}