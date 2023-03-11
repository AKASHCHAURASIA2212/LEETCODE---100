/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    
    public TreeNode helper(ArrayList<Integer> li , int lo ,int hi){
        if(hi<lo){
            return null;
        }
        int mid = (lo+hi)/2;
        
        TreeNode  root = new TreeNode();
        int val =  li.get(mid);
        root.val = val;
        li.set(mid,val);
        
        root.left = helper(li,lo,mid-1);
        root.right = helper(li,mid+1,hi);
        
        return root;
            
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)return null;
        ArrayList<Integer> li = new ArrayList<>();
        while(head!=null){
            li.add(head.val);
            head = head.next;
        }
        
        TreeNode root = helper(li,0,li.size()-1);
        return root;
    }
}