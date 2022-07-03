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
    
//     public int sumnum(TreeNode root , StringBuilder asf, int sum)
//     {
//         if(root.left==null && root.right==null)
//         {
//         asf.append(root.val);
            
//           int ans = Integer.parseInt(asf.toString());
//             // System.out.println(ans);
//             sum+=ans;
//             asf.deleteCharAt(asf.length()-1);
//             return sum;
//         }
        
//         if(root.left==null || root.right==null)
//         {
//             int ans = Integer.parseInt(asf.toString());
//             // System.out.println(ans);
//             sum+=ans;
//             asf.deleteCharAt(asf.length()-1);
//             return sum;  
//         }
        
//         asf.append(root.val);
        
//        int mysum1 = sumnum(root.left,asf,sum);
//         // System.out.println("mysum1-->"+mysum1);
//        int mysum2 = sumnum(root.right,asf,mysum1);
//         // System.out.println("mysum2-->"+mysum2);
//         return mysum2;
        
//     }
    int sum = 0 ;
    public void helper(TreeNode root, int val)
    {
        if(root==null)
        {
            return;
        }
        
        if(root.left==null && root.right==null)
        {
            sum+=val*10+root.val;
            return;
        }
        
        helper(root.left,val*10+root.val);
        helper(root.right,val*10+root.val);
        
        
    }
    public int sumNumbers(TreeNode root) {
        // return sumnum(root,new StringBuilder(),0);
        sum=0;
        helper(root,0);
        return sum ;
    }
}