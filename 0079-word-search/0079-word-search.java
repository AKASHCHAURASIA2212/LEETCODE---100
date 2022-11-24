class Solution {
    
    int [][] dir= {{0,1},{1,0},{0,-1},{-1,0}}; 
    public boolean helper(int sr,int sc,int idx , String str , char[][] board , boolean[][] vis){
        if(idx==str.length()-1){
            
            if(str.charAt(idx)==board[sr][sc]){
                return true;
            }
        }
        
        // direction left-down-right-top
        // System.out.println(str.charAt(idx)+" "+board[sr][sc]);
        if(str.charAt(idx)!=board[sr][sc]){
            return false;
        }
        
        for(int i=0;i<dir.length;i++){
            int[] mydir = dir[i];
            int dr = mydir[0];
            int dc = mydir[1];
            // System.out.println("------------------------------------------");
            // System.out.println("row->"+(sr+dr)+" col->"+(sc+dc)+" idx->"+idx);
            // System.out.println("------------------------------------------");
                // check to do not go out of board
                if(sr+dr<board.length && sc+dc<board[0].length && sr+dr>=0 && sc+dc>=0){
                         if(vis[sr+dr][sc+dc]==false){
                            vis[sr][sc]=true;
                            boolean ans = helper(sr+dr,sc+dc,idx+1,str,board,vis);
                            if(ans)return true;
                            vis[sr][sc]=false;
                }
            }
        }
        
        return false ;
    }
    public boolean exist(char[][] board, String word) {
        ArrayList<int[]> sp = new ArrayList<>();
        
        char ch  = word.charAt(0);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(ch==board[i][j]){
                    int[] cordinate = {i,j};
                   
                    sp.add(cordinate);
                }
            }
        }
        
        // for(int[] x : sp){
            // System.out.println(x[0]+" "+x[1]);
        // }
        boolean[][] vis = new boolean[board.length][board[0].length];
        for(int i=0;i<sp.size();i++){
            int[] point = sp.get(i);
            int sr = point[0];
            int sc = point[1];
            vis[sr][sc] = true;
             // System.out.println("call-> "+i);
            boolean ans = helper(sr,sc,0,word,board,vis);
            if(ans)return true;
            vis[sr][sc] = false;
        }
        
      return false ;
    }
}