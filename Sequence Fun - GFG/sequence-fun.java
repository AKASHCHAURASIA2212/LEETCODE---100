//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.NthTerm(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int NthTerm(int n)
    {
        if(n==1){
            return 2 ;
        }
     long num = 2 ;
     long module = 1000000000+7 ;
     for(int i=2;i<=n;i++){
         num = (num*i)+1 ;
         num = num%module;
     }
     return (int)num;
        
    }
}