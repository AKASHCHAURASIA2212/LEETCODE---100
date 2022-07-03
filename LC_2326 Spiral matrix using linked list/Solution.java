/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int ans[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[i][j]=-1; 
            }
        }
        int count = 0;
        int minrow=0;
        int maxrow=m-1;
        int mincol=0;
        int maxcol=n-1;
        while(head!=null )
        {
            // min row
            if(head==null)
            {
                break;
            }
            for(int i=mincol ; i<=maxcol;i++)
            {
                   if(head==null)
                  {
                   break;
                  }
                  int val = head.val;
                  head = head.next;
                  // System.out.println("i--> "+minrow+"j--> "+i+"val--> "+val);
                  
                  ans[minrow][i] = val;
                   // System.out.print(ans[minrow][i]+ "  ");
            }
            
            
            minrow++;
            
            //maxcol
             if(head==null)
            {
                break;
            }
            for(int j=minrow ; j<=maxrow ;j++)
            {
                   if(head==null)
            {
                break;
            }
               int val = head.val;
               head = head.next;
                ans[j][maxcol]=val;
                  // System.out.print(ans[j][maxcol]+ "  ");
            
            }
             maxcol--;
            //maxrow
              if(head==null)
            {
                break;
            }
            for(int i=maxcol ; i>=mincol;i--)
            {
                   if(head==null)
            {
                break;
            }
                 int val = head.val;
                 head = head.next;
                   ans[maxrow][i]=val;
                  // System.out.print(ans[maxrow][i]+ "  ");
    
            }
            maxrow--;
            
            //mincol
              if(head==null)
            {
                break;
            }
            for(int j=maxrow ; j>=minrow ;j--)
            {
                   if(head==null)
            {
                break;
            }
                int val = head.val;
                head = head.next;
                 ans[j][mincol]=val;
                  // System.out.print(ans[j][mincol]+ "  ");
    
                
            }
            mincol++;
            
        }
        return ans;
    }
}