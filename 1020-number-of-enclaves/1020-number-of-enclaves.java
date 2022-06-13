// class Solution {
//     public int numEnclaves(int[][] grid) {
        
//     }
// }

class Solution {
    
    boolean flag = true;
    int len = 0;
    
    // static int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
    
    public void jump(int[][] grid ,int i,int j,boolean[][] vis)
    {
        if(i<0 || j>=grid[0].length || i>=grid.length || j<0)
        {
            flag=false;
           return;
        }
        else if(vis[i][j]==true)
        {
            return;
        }
        else if(grid[i][j]==0)
        {
            return;
        }
        
        ++len;
        vis[i][j]=true;
        jump(grid,i-1,j,vis);
        jump(grid,i,j+1,vis);
        jump(grid,i+1,j,vis);
        jump(grid,i,j-1,vis);
     
    }
    public int numEnclaves(int[][] grid) {
        
        int count=0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        for(int i = 0 ;i<grid.length;i++){

         for(int j = 0;j<grid[0].length;j++)
         {

              if(grid[i][j]==1 && vis[i][j]==false)
              {
                  flag=true;
                  len=0;
                jump(grid,i,j,vis);
                  
                  if(flag)
                  {
                   count+=len;   
                  }
                
              }
         }
        }
        return count;
    }
}