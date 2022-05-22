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
    
    public TreeNode maximum(TreeNode root)
    {
      if(root.right==null)
          return root;
        
        return maximum(root.right);
    }
    
    public TreeNode minimum(TreeNode root)
    {
      if(root.left==null)
          return root;
        
        return minimum(root.left);
    }
    
    public TreeNode deleteBst(TreeNode root,int key) {
        
        if(root==null)
        {
            return null ;
        }
        
        if(root.val == key)
        {
            // case 1 zero child
            if(root.left==null && root.right==null){
                return null;
            }
            // case 2 one child
            else if (root.left!=null && root.right==null || root.right!=null && root.left==null)
            {
               if(root.left!=null)
               {
                  return root=root.left;
               }
                
               if(root.right!=null)
               {
                  return root=root.right;
               }
                
            }

            // case 3 two child
            else if(root.left!=null && root.right!=null)
            {
                TreeNode max = minimum(root.right);
                deleteBst(root,max.val);
                max.left = root.left;
                max.right=root.right;
                root= max;
                return root;
            }
         
        } 
        
        if(key < root.val)
        {
           root.left = deleteBst(root.left,key);
        }
        else if(key > root.val)
        {
           root.right = deleteBst(root.right,key);
        }
        
        return root;
        
    } 
    public TreeNode deleteNode(TreeNode root, int key) {
         return deleteBst(root,key);
        
    }
}
