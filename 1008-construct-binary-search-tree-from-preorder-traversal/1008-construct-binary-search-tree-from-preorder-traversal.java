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
    
    public void helper(TreeNode root,int val)
    {
        if(root.left==null && root.val>val)
        {
            TreeNode node = new TreeNode(val);
            root.left=node;
        }
        else if(root.right==null&& root.val<val)
        {
          TreeNode node = new TreeNode(val);
            root.right=node;
        }
        
        if(root.left!=null && root.val>val)
        {
             helper(root.left,val);
        }
        else if(root.right!=null && root.val<val)
        {
             helper(root.right,val);
        }
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            helper(root,preorder[i]);
        }
        return root;
    }
}