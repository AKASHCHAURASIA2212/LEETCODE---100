//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public int binarySearch(int[] arr,int i ,int j ,int tar){
        
        while(i<=j){
            int mid  = (i+j)/2;
            
            if(arr[mid]==tar){
                return mid;
            }
            else{
                if(arr[mid]>tar){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }
        }
        return -1;
    }
    int binarysearch(int arr[], int n, int k) {
        // code here
        return binarySearch(arr,0,n-1,k);
    }
}