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
    
    // 1--> c
    // 0--> m
    // -1 --> nm ;
    public int treecam(TreeNode root) {
        if(root==null)
        {
            return 0 ;
        }
        
        int left = treecam(root.left);
        int right = treecam(root.right);
        
        if(left==0 && right==0)
        {
            return -1 ;
        }
        else if(left==-1 || right==-1)
        {
            cam++;
            return 1;
        }
        else if(left==1 || right==0)
        {
            return 0 ;
        }
        else if(right==1 || left==0)
        {
            return 0 ;
        }
        
        return -2;
    }
    
     // 1--> c
    // 0--> m
    // -1 --> nm ;
    int cam=0;
        public int minCameraCover(TreeNode root) {
        if(root==null)
        {
            return 0 ;
        }
        else if(root.left==null  && root.right==null)
        {
            return 1;
        }
        
        int left = treecam(root.left);
        int right = treecam(root.right);
        
        if(left==0 && right==0)
        {
            cam++;
            return cam;
        }
        else if(left==-1 || right==-1)
        {
            cam++;
            return cam;
        }
        else if(left==1 || right==0)
        {
            return cam;
        }
        else if(right==1 || left==0)
        {
            return cam;
        }
       return -2;
    }
}