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
    
    public String treeStr(TreeNode root , String str){
        if(root==null)return str ;
        
        // System.out.println(str);
        
        str +=root.val;
        
        if(root.left!=null){
            str+="(" ;
            str = treeStr(root.left ,str) ;
        }
        else if(root.left==null && root.right!=null){
            str+="()";
        }
        
        if(root.right!=null){
            str+="(" ;
            str = treeStr(root.right ,str) ;
        }
        
        
        if(root!=head){
        str+=")";
        }
        
        return str ;
    }
    
    TreeNode head = null;
    public String tree2str(TreeNode root) {
          head=root;
        return treeStr(root,"");
    }
}