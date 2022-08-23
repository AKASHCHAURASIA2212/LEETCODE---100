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
    public TreeNode helper(int[] pre ,int min ,int max)
    {
        if(idx==pre.length){
            return null;
        }
        else if(pre[idx]>min && pre[idx]<max)
        {
            TreeNode node  = new TreeNode();
            node.val = pre[idx];
            idx++;
            node.left = helper(pre,min,node.val);
            node.right = helper(pre,node.val,max);
            return node ;
            
        }
        else{
          return null ;
        }
    }
    int idx=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}