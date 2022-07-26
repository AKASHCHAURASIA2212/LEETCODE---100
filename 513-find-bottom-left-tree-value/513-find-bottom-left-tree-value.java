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
    
    public int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        return Math.max(lh,rh)+1;
    }
    public int findBottomLeftValue(TreeNode root) {
        
      int ht = height(root);
      Queue<TreeNode> qu = new LinkedList<>();
      

      qu.add(root);
      int count=1;
      while(qu.size()>0)
      {
          int size  = qu.size();
          
          for(int i = 0 ;i < size ; i++)
          {
              TreeNode temp = qu.remove();
              
              if(i==0 && count==ht)
              {
                  return temp.val;
              }
              
              if(temp.left!=null)
              {
                  qu.add(temp.left);
              }
              
              if(temp.right!=null)
              {
                  qu.add(temp.right);
              }
          }
          count++;
      }
      
     return -1;
    }
}