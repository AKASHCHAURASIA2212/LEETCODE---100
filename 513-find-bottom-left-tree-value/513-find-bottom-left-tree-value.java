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
          public List<Integer> leftSideView(TreeNode root)
    {
      List<Integer> list = new ArrayList<Integer>();
      
      Queue<TreeNode> qu = new LinkedList<>();
      
      if(root==null)
      {
          return list;
      }
      qu.add(root);
      
      while(qu.size()>0)
      {
          int size  = qu.size();
          
          for(int i = 0 ;i < size ; i++)
          {
              TreeNode temp = qu.remove();
              
              if(i==0)
              {
                  list.add(temp.val);
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
      }
      
      return list;
    }
    public int findBottomLeftValue(TreeNode root) {
        
        List<Integer> li = leftSideView(root);
        
        return li.get(li.size()-1);
        
    }
}