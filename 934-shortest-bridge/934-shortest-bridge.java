class Solution {
    
    class Pair{
        int i;
        int j;
        int level;
        public Pair(int i,int j,int level)
        {
            this.i=i;
            this.j=j;
            this.level=level;
        }
    }
    
    public void markComponents(int[][] grid,boolean[][] vis1,Queue<Pair> qu,int i,int j) {
        
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length)
        {
            return;
        } else if(vis1[i][j])
        {
           return;
        }
        else if(grid[i][j]==0)
        {
           return;
        }
            
            
        vis1[i][j]=true;
        qu.add(new Pair(i,j,0));
        
        markComponents(grid,vis1,qu,i-1,j);
        markComponents(grid,vis1,qu,i+1,j);
        markComponents(grid,vis1,qu,i,j-1);
        markComponents(grid,vis1,qu,i,j+1);
        
        grid[i][j]=-1;
            
    }
    
    public int shortestBridge(int[][] grid) {
        
        Queue<Pair> qu = new LinkedList<>();
        boolean[][] vis1 = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            boolean temp = false;
            for(int j=0;j<grid.length;j++)
            {
                if(grid[i][j]==1)
                {
                    markComponents(grid,vis1,qu,i,j);
                    temp=true;
                    break;
                }
            }
            
            if(temp)
            {
              break;
            }
        }
        
        
        boolean[][] vis2 = new boolean[grid.length][grid[0].length];

        while(qu.size()>0)
        {
            Pair rem = qu.remove();
            
            if(vis2[rem.i][rem.j])
            {
                continue;
            }
            vis2[rem.i][rem.j]=true;
            
            if(grid[rem.i][rem.j]==1)
            {
                return rem.level-1;
            }
            
            addNB(grid,vis2,qu,rem.i-1,rem.j,rem.level+1);
            addNB(grid,vis2,qu,rem.i+1,rem.j,rem.level+1);
            addNB(grid,vis2,qu,rem.i,rem.j-1,rem.level+1);
            addNB(grid,vis2,qu,rem.i,rem.j+1,rem.level+1);
        }
        
        return -1;
    }
    
    public void addNB(int[][] grid,boolean[][] vis2,Queue<Pair> qu ,int i,int j,int level)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length)
        {
            return;
        } else if(vis2[i][j])
        {
           return;
        }
        else if(grid[i][j]==-1)
        {
           return;
        }
        // vis2[i][j]=true;
        
        qu.add(new Pair(i,j,level));
    }
}