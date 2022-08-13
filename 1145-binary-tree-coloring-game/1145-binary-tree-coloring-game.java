/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int size(TreeNode root)
    {
        if(root==null)
        {
            return 0 ;
        }
        
        int ls = size(root.left);
        int rs = size(root.right);
        
        int mysize = ls+rs+1;
        
        return mysize;
    }
    
    TreeNode findNode(TreeNode root,int x)
    {
        if(root==null)
        {
           return null ;
        }
        if(root.val==x)
        {
            return root ;
        }
       TreeNode n1 =  findNode(root.left,x);
        
        if(n1!=null)
        {
            return n1 ;
        }
       TreeNode n2 = findNode(root.right,x);
         if(n2!=null)
        {
            return n2 ;
        }
        
        return null ;
        
    }
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        
        TreeNode p1root = findNode(root,x);
        
        int s1 = size(p1root.left);
        int s2 = size(p1root.right);
        int s3 = n - (s1+s2+1);
        
        int max = Math.max(s1,Math.max(s2,s3));
        
        System.out.println("s1--> "+s1);
        System.out.println("s2--> "+s2);
        System.out.println("s3--> "+s3);
        
        
        if(n-max<=n/2)
        {
            return true;
        }
        
        return false ;
     
        
        
    }
}