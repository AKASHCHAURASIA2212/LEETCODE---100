/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    public static TreeNode DFS(TreeNode root , TreeNode Target)
    {
        if(root==null)
        {
            return null ;
        }
        
        else if(root.val==Target.val)
        {
            return root;
        }
        TreeNode ans1  = DFS(root.left,Target);
        
        if(ans1!=null)
        {
          return ans1 ;
        }
        
        TreeNode ans2  = DFS(root.right,Target);
        
        if(ans2!=null)
        {
          return ans2 ;
        }
        
        return null ;
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        TreeNode myans = DFS(cloned,target);
        
        return myans ;
    }
}