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
    int sum=0;
    
    public void rangeSum(TreeNode root, int lo ,int hi)
    {
       if(root==null)
       {
           return ;
       }
        
        rangeSum(root.left,lo,hi);
        if(root.val>hi)
        {
            return ;
        }
        else if(root.val>lo && root.val<hi)
        {
             sum+=root.val ;
        }
        
        rangeSum(root.right,lo,hi);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
     sum+=low+high;
        rangeSum(root,low,high);
        return sum ;
        
    }
}