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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        
        if(root==null)
        {
            return list;
        }
        
        Queue<TreeNode> qu = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        
        qu.add(root);
        qu.add(null);
        
        while(qu.size()>0)
        {
            
            TreeNode rem = qu.remove();
            st.push(rem);
            
            if(rem!=null){
                    if(rem.right!=null)
                   {
                    qu.add(rem.right);
                   }
                  if(rem.left!=null)
                  {
                    qu.add(rem.left);
                  }
            }
            else
            {
               if(qu.size()>0)
               {
                   qu.add(null);
               }
            }
           
            
        }
        
     
        ArrayList<Integer> al = new ArrayList<>();
        st.pop();
        while(st.size()>0)
        {
            
            TreeNode rem = st.pop();
            if(rem!=null)
              System.out.println(rem.val);
            
            if(rem!=null)
            {
                al.add(rem.val);
            }
            else
            {
                list.add(al);
                al = new ArrayList<>();
            }
        }
        list.add(al);
        
        return list ;
    }
}