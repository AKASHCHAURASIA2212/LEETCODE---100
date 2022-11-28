class Solution {
    
    
    public List<List<String>> list ;
    public static boolean canIPlaceQueen(int row,int col,char[][] board){
        
        // stright up check
        for(int i=row-1;i>=0;i--){
            
            if(board[i][col]=='Q'){
                return false ;
            }
        }

        
        // daigonal left check
        
        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
            
            if(board[i][j]=='Q'){
                return false ;
            }
        }
        
        
        // daigonal right check
        
        for(int i=row-1,j=col+1;i>=0 && j<board[0].length ;i--,j++){
            
            if(board[i][j]=='Q'){
                return false ;
            }
        }
        
        return true ;
    }
    
    
    public  ArrayList<String> convert(char[][] board){
        ArrayList<String> li = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String str="";
            for(int j=0;j<board[0].length;j++){
                str+=board[i][j];
            }
            li.add(str);
        }
        return li;
    }
    
    
    public void helper(int row, char[][] board ) {
        
        if(row==board.length){
            // do some work 
            ArrayList<String> li = convert(board);
            list.add(li);
            return ;
            
        }
        
        for(int col=0;col<board[0].length;col++){
            
            if(canIPlaceQueen(row,col,board)){
                // System.out.println("Q");
                board[row][col]='Q';
                helper(row+1,board);
                board[row][col]='.';
            }
        }
        
        
             
    }

    
    public List<List<String>> solveNQueens(int n) {
        list = new ArrayList<>();
         char[][] board = new char[n][n];
         for(int i=0;i<board.length;i++){
        
            for(int j=0;j<board[0].length;j++){
                board[i][j] = '.';
            }
        }
        helper(0,board) ;
        return list ;
    }
 }