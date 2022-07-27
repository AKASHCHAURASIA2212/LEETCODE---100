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
    public boolean evaluateTree(TreeNode root) {
        
        if(root.left==null && root.right==null)
        {
          return root.val==0 ?false : true ;
        }
        
        
        boolean a1 =false ;
        if(root.left!=null)
            a1 = evaluateTree(root.left);
        
        boolean a2 =false ;
        if(root.right!=null)
            a2 = evaluateTree(root.right);
        
        return (root.val==2)? a1||a2 : a1&&a2 ;
    }
}