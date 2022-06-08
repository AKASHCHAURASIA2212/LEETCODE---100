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
    int sum = 0;
    
     public void greterBST(TreeNode root) {
        
         if(root==null){
            return ;
         }
         
         greterBST(root.right);
         
         
         sum+=root.val;
         root.val = sum;
         
         greterBST(root.left);
         
    }
    
//     public void maxBST(TreeNode root)
//     {
       
//       if(root.left==null)
//       {
//         sum = root.val;
//           return ; 
//       }
//         maxBST(root.left);
//     }
    
    public TreeNode convertBST(TreeNode root) {
         if(root==null)
        {
            return null;
        }
        // maxBst(root);
        greterBST(root);
        
        return root;
    }
}