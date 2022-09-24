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
    public void helper(TreeNode root){
        if(root==null)return;
        helper(root.left);
        al.add(root);
        helper(root.right);
    }
      ArrayList<TreeNode> al;
    public TreeNode increasingBST(TreeNode root) {
      al = new ArrayList<>();
        helper(root);
        TreeNode[] arr = new TreeNode[al.size()];
        arr = al.toArray(arr);
        for(int i=0;i<arr.length;i++){
            TreeNode node = arr[i];
            // System.out.println(node.val);
            node.left=null;
            if(i<arr.length-1){
            node.right=arr[i+1];
            }
        }
        return arr[0];
    }
}