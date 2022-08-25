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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null)
        {
            return null;
        }
        else if(root1==null && root2!=null)
        {
            return root2;
        }
        if(root1!=null && root2==null)
        {
            return root1;
        }
        TreeNode node = new TreeNode();
        
        if(root1!=null && root2!=null)
        {
            node.val = root1.val+root2.val ;
        }
        else if(root1!=null && root2==null)
        {
            node.val = root1.val ;
        }
        else if(root2!=null && root1==null)
        {
            node.val = root2.val ;
        }
        
        if(root1.left!=null && root2.left!=null)
        {
             node.left =  mergeTrees(root1.left,root2.left);
        }
        else if(root1.left==null && root2.left!=null)
        {
            node.left = root2.left;
        }
        else if(root2.left==null && root1.left!=null)
        {
            node.left = root1.left;
        }
        
         if(root1.right!=null && root2.right!=null)
        {
             node.right = mergeTrees(root1.right,root2.right);
        }
        else if(root1.right==null && root2.right!=null)
        {
            node.right = root2.right;
        }
        else if(root2.right==null && root1.right!=null)
        {
            node.right = root1.right;
        }
        return node;
        
        
    }
}