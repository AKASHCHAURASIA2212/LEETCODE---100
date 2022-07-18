class Solution {
//     public boolean minsuduko(int li,int lj,char[][] board)
//     {
      
//     }
    public boolean isValidSudoku(char[][] board) {
        boolean[] vis = new boolean[9];
        
        int mycount =0 ;
        for(int i=0;i<9;i++)
        {
           for(int j=0;j<9;j++)
           {
               if(board[i][j]=='.')
               {
                   mycount++;
               }
           }
        }
        
        if(mycount==81)
        {
            return true;
        }
        
        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char num = board[i][j];
                if(num=='.')
                   {
                       continue;
                   }
                if(vis[num-'0'-1]==true)
                {
                    return false;
                }
                else
                {
                   vis[num-'0'-1]=true;
                }
            }
            Arrays.fill(vis,false);
        }
        
        for(int j=0;j<9;j++)
        {
            for(int i=0;i<9;i++)
            {
                char num = board[i][j];
                 if(num=='.')
                   {
                       continue;
                   }
                if(vis[num-'0'-1]==true)
                {
                    return false;
                }
                else
                {
                   vis[num-'0'-1]=true;
                }
            }
            Arrays.fill(vis,false);
        }
        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                boolean temp = validsuduko(board,i,j);
                
                if(!temp)
                {
                    return false;
                }
                j=j+2;
            }
            i+=2;
        }
        
        return true ;     
    }
    public boolean validsuduko(char[][] board ,int x ,int y)
    {
         int mx = x+2;
         int my = y+2;
         boolean[] vis = new boolean[9];
        for(int i=x;i<=mx;i++)
        {
            for(int j=y;j<=my;j++)
            {
                char ch = board[i][j];
                System.out.print(board[i][j]+" ");
                if(ch=='.')continue ; 
                
                if(vis[ch-'0'-1]==true)
                {
                  return false;
                }
                else
                {
                    vis[ch-'0'-1]=true;
                }
            }
            System.out.println();
        }
        return true;
    }
}