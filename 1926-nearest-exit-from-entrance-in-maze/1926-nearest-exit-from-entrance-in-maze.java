// class Solution {
//     int[][]dir = {{-1,0},{1,0},{0,-1},{0,1}};
    
//     public int treval(int src,int dest,char[][]maze,int step){
    
        
//          step++;
//         if(src==0 || src==maze.length-1 || dest==0 || dest==maze[0].length-1){
//             return step;
//         }
       
//         int myAns = -1;
//         int rAns = -2;
        
//         if(src+dir[0][0]<maze.length && dest+dir[0][1]<maze[0].length && maze[src+dir[0][0]][dest+dir[0][1]]=='.' && vis[src+dir[0][0]][dest+dir[0][1]]==false){
//             vis[src][dest]=true;
//                 rAns = treval(src+dir[0][0],dest+dir[0][1],maze,step);
//             if(rAns<myAns){
//                 myAns=rAns;
//             }
//              // vis[src][dest]=false;
            
//         }
        
//         if(src+dir[1][0]<maze.length && dest+dir[1][1]<maze[0].length && maze[src+dir[1][0]][dest+dir[1][1]]=='.' && vis[src+dir[1][0]][dest+dir[1][1]]==false){
//              vis[src][dest]=true;
//                 rAns = treval(src+dir[1][0],dest+dir[1][1],maze,step);
//             if(rAns<myAns){
//                 myAns=rAns;
//             }
//               // vis[src][dest]=false;
            
//         }
        
//         if(src+dir[2][0]<maze.length && dest+dir[2][1]<maze[0].length && maze[src+dir[2][0]][dest+dir[2][1]]=='.' && vis[src+dir[2][0]][dest+dir[2][1]]==false){
//              vis[src][dest]=true;
//                 rAns = treval(src+dir[2][0],dest+dir[2][1],maze,step);
//             if(rAns<myAns){
//                 myAns=rAns;
//             }
//               // vis[src][dest]=false;
            
//         }
        
//         if(src+dir[3][0]<maze.length && dest+dir[3][1]<maze[0].length && maze[src+dir[3][0]][dest+dir[3][1]]=='.' && vis[src+dir[3][0]][dest+dir[3][1]]==false){
//              vis[src][dest]=true;
//                 rAns = treval(src+dir[3][0],dest+dir[3][1],maze,step);
//             if(rAns<myAns){
//                 myAns=rAns;
//             }
//               // vis[src][dest]=false;
            
//         }
        
        
        
//         return myAns ;    
//     }
//    static boolean[][]vis ;
//     public int nearestExit(char[][] maze, int[] entrance) {
//         vis = new boolean[maze.length][maze[0].length];
//         int myAns = -1 ; 
        
//         for(int i=0;i<4;i++){
//             int[] dirc = dir[i];
//             int row = entrance[0];
//             int col = entrance[1];
//             int x = dirc[0];
//             int y = dirc[1];
//             if(maze[row+x][col+y]=='.'){
//                 vis[row][col]=true;
//                  int rAns = treval(row+x,col+y,maze,0);
//                 if(rAns<myAns){
//                    myAns=rAns;
//                  }
//             }
            
//         }
        
//         return myAns;
//     }
// }

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int columns = maze[0].length;

        // For breadth first search, offer the first node ('entrance').
        // Note that we immediately mark the node as visited when putting into the queue as to
        // prevent other nodes from visiting it. Otherwise, we will be trapped in an infinite loop.
        // Credit: @b_clodius for the detailed explanation and test.
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';

        // As simple 2D array to keep track of the directions to take.
        // We can use 4 separate operation, but it is more efficient to use a for-loop to go through the four directions.
        int[][] directions = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};

        int steps = 0;
        int x, y;
        while (!queue.isEmpty()) {
            // We take a step before checking the directions for the nodes that we are at (in the queue).
            steps++;

            // Make sure to use a variable to keep track of the queue.size(),
            // because the queue size continuously changes as we check for the other nodes,
            // which can lead to infinite loops or undue termination of the for-loop.
            int n = queue.size();

            // Check every node at the current step.
            for (int i = 0; i < n; i++) {
                int[] current = queue.poll();
                // For each node, check every direction.
                for (int[] direction : directions) {
                    x = current[0] + direction[0];
                    y = current[1] + direction[1];

                    // Check if this direction out of bound.
                    if (x < 0 || x >= rows || y < 0 || y >= columns) continue;
                    // Check if this direction is the wall.
                    if (maze[x][y] == '+') continue;

                    // If this direction is empty, not visited and is at the boundary, we have arrived at the exit.
                    if (x == 0 || x == rows - 1 || y == 0 || y == columns - 1) return steps;

                    // Otherwise, we change this direction as visited and put into the queue to check at the next step.
                    maze[x][y] = '+';
                    queue.offer(new int[]{x, y});
                }
            }

        }
        // If all the possible nodes and directions checked but no exits found, return -1.
        return -1;
    }
}