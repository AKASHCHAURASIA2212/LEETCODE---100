

class Solution {
    
    public void treverse(int[][] grid,int i,int j)
    {
      
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0)
        {
            maxperimter++;
            return;
        }
        
        if(grid[i][j]==1)
        {
          return;
        }
    }
    
    static int maxperimter = 0 ;
    public int islandPerimeter(int[][] grid) {
         
        // boolean[][] vis = new boolean[grid.length][grid[0].length];
        
        int mymax=0;
        for(int i=0 ; i< grid.length ; i++)
        {
            for(int j=0 ; j< grid[0].length ; j++)
            {
               if(grid[i][j]==1)
               {
                     treverse(grid,i-1,j);
                     treverse(grid,i+1,j);
                     treverse(grid,i,j-1);
                     treverse(grid,i,j+1);
                   
                   mymax +=maxperimter;
                   maxperimter=0;
               }
            }
            
        }
        
        return mymax;
    }
}