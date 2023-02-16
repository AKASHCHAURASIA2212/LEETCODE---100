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
    int max = 0;
    public void helper(TreeNode root,int height){
        if(root==null){
            if(height>max){
                max=height;
            }
            return;
        }
        
        helper(root.left,height+1);
        helper(root.right,height+1);
        
    }
    public int maxDepth(TreeNode root) {
        helper(root,0);
        return max;
    }
}