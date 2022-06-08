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
    
     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         
        List<List<Integer>> list = new ArrayList<>();
         
        if(root == null)
            return list;
         
        Queue<TreeNode> q = new LinkedList<>();
         
        q.offer(root);
         
        boolean levelorder = false;
        while(!q.isEmpty()){
            
            int size = q.size(); 
            
            LinkedList<Integer> levelValues = new LinkedList<>();  
            
            levelorder = !levelorder;
            
            while(size-- > 0){
                       
                TreeNode curr = q.poll();  
                if(levelorder)
                    levelValues.add(curr.val); 
                else
                    levelValues.addFirst(curr.val);
                
                if(curr.left != null)
                    q.offer(curr.left);
                if(curr.right != null)
                    q.offer(curr.right);      
                                     
            }
            //System.out.println("Level values are "+levelValues);
            list.add(levelValues);
        }
        return list;
    }
}