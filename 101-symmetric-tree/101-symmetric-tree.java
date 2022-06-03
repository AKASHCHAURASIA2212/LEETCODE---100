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
    
    public boolean isSimiler(TreeNode x,TreeNode y)
    {
      if(x==null && y==null)
      {
          return true;
      }
        if(x!=null || y!=null)
        {
            if(x!=null && y==null || y!=null && x==null)
            {
                return false;
            }
            
            if(x.val!=y.val)
            {

            return false;
            
            }
            
            return isSimiler(x.left,y.right) && isSimiler(x.right,y.left);
        }
        
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
     
        if(root==null)
        {
          return false;
        }
        
        return isSimiler(root.left,root.right);
    }
}