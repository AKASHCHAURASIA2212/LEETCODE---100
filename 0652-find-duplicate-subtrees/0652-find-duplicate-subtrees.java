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
    
    public static String helper(TreeNode root,ArrayList<TreeNode> li ,HashMap<String,Integer> hm){
        if(root==null){
            return "N";
        }
        
        String lstr = root.val+helper(root.right,li,hm)+helper(root.left,li,hm);
        
        if(hm.containsKey(lstr)){
            int val = hm.get(lstr);
            // System.out.println(lstr+"-->"+val);
            if(val==1){
                 li.add(0,root);
            }
            hm.put(lstr,val+1);
           
        }
        else{
            hm.put(lstr,1);
        }

        
        return lstr;
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String,Integer> hm = new HashMap<>();
        ArrayList<TreeNode> list = new ArrayList<>();
        helper(root,list,hm);
        return list;
    }
}