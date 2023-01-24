//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    public static int findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        int n = arr[0].length;
        boolean temp = false;
        int[] vis = new int[arr[0].length];
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if(arr[j][k]==1){
                    temp=true;
                    vis[j]--;
                    vis[k]++;
                }
            }
        }
        if(!temp)return -1;
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for(int i=0;i<n;i++){
            if(vis[i]==n-1){
              idx = i;
            }
        
        }
        
        
        // for(int i=0;i<n;i++){
        //     if(arr[idx][i]==1){
                
        //         return -1;
        //     }
        // }
        
        return idx;
    }
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	return findCelebrity(M);
    }
}