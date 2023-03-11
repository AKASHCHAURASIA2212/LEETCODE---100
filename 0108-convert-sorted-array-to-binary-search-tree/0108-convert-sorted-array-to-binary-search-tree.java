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
     public TreeNode helper(int[] li , int lo ,int hi){
        if(hi<lo){
            return null;
        }
        int mid = (lo+hi)/2;
        
        TreeNode  root = new TreeNode();
        int val =  li[mid];
        root.val = val;
        
        root.left = helper(li,lo,mid-1);
        root.right = helper(li,mid+1,hi);
    
        return root;
            
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
}