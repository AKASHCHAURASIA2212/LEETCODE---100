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
    
    public int nodes(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int left = nodes(root.left);
        int right = nodes(root.right);
        
        return left+right+1;
        
    }
    public int countNodes(TreeNode root) {
        
        return nodes(root);
        
    }
}