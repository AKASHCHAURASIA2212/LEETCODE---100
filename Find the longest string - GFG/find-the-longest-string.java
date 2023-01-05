//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            String res = obj.longestString(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    
    public static boolean isPrefix(String temp, HashSet<String> hs){
        
        for(int i=1;i<=temp.length();i++){
            String check = temp.substring(0,i);
            
            if(hs.contains(check)==false){
                return false;
            }
        }
        
        return true;
    }
    public static String longestString(int n, String[] arr) {
        // code here
        Arrays.sort(arr);
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        
        String ans = "";
        
        for(int i=0;i<n;i++){
            String temp = arr[i];
            
            if(isPrefix(temp,hs)){
                if(ans.length()<temp.length()){
                    ans=temp;
                }
            }
            
            
        }
        
        return ans;
    }
}
        
