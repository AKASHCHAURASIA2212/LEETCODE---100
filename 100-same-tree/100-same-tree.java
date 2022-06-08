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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> qu1 = new LinkedList<>();
        Queue<TreeNode> qu2 = new LinkedList<>();
        qu1.add(p);
        qu2.add(q);
        
        while(qu1.size()>0 && qu2.size()>0)
        {
            TreeNode root1 = qu1.remove();
            TreeNode root2 = qu2.remove();
            
            if(root1==null && root2!=null || root2==null && root1!=null)
            {
                return false ; 
            }
            
            if(root1==null && root2==null)
            {
                continue;
            }
            if(root1.val==root2.val)
            {
                qu1.add(root1.left);
                qu1.add(root1.right);
                qu2.add(root2.left);
                qu2.add(root2.right);     
            }
            
            else
            {
                return false;
            }       
        }
        
        if(qu1.size()!=qu2.size())
        {
            return false;
        }
        
        return true;
        
    }
}