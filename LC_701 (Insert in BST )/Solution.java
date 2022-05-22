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
    
    public TreeNode InsertInBST(TreeNode root,int val) {

        if(root==null)
        {
           TreeNode mynode  = new TreeNode(val);
            return mynode;
        }
        if(val < root.val )
        {
            if(root.left==null)
            {
            TreeNode mynode  = new TreeNode(val);
            root.left = mynode;
            }
            else
            {
              InsertInBST(root.left,val);
            }
        }
        
          if(val > root.val )
        {
            if(root.right==null)
            {
            TreeNode mynode  = new TreeNode(val);
            root.right = mynode;
            }
            else
            {
              InsertInBST(root.right,val);
            }
        }
    
      return root;
    
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        return InsertInBST(root,val);
        
    }


    // method 2
    public TreeNode InsertInBST(TreeNode root,int val) {
        
      if(root==null)
      {
          return new TreeNode(val);
      }
       else if(root.val<val)
       {
           root.right=InsertInBST(root.right,val);
       }
       else{
          root.left = InsertInBST(root.left,val);
       }
     return root;
 }
}
