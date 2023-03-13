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
    
    public boolean helper(TreeNode n1,TreeNode n2){

    if(n1==null&&n2==null){
return true;
    }else if(n1==null && n2!=null || n2==null && n1!=null ){
        return false;
    }
        
        if(n1.val!=n2.val)return false;
        
        boolean result = helper(n1.left,n2.right);
        if(!result)return false;
        return helper(n1.right,n2.left);
        // if(!right)return false;
        
        // return true;
        
    
    }
    public boolean isSymmetric(TreeNode root) {
        return helper(root,root);
    }
}