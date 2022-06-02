class Solution {
    
    public void jump(int i,int j,char[][] grid)
    {
        
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length)
        {
            return;
        }
       int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
        for(int k = 0 ; k<dir.length ;k++)
        {

            int row = i  +  dir[k][0];
            int col = j  +  dir[k][1];
            
            if(row<0 || col<0 || row>=grid.length || col>=grid[0].length)
            {
                continue;
            }
            if(grid[row][col]=='1')
              {
              grid[row][col]='0';
                jump(row,col,grid);
              }
        }
     
        
    }
    public int numIslands(char[][] grid) {
        int count = 0 ;
        for(int i = 0 ; i < grid.length; i++)
        {
           for(int j =0 ;j<grid[0].length;j++)
           {
               if(grid[i][j]=='1')
               {
                   grid[i][j]='0';
                  count++;
                   jump(i,j,grid);
               }
           }
        }
        
        return count;
        
    }
}