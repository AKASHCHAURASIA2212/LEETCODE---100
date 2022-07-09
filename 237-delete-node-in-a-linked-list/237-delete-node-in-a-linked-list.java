/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode prev = node ; 
        ListNode temp = node ; 
        ListNode curr = node.next;
        boolean flag = true;
        while(flag)
        {
            if(curr!=null)
            {
            prev.val = curr.val;
            temp=prev;
            prev = curr;
            curr=curr.next;
            }
            else
            {
              temp.next = null;
                flag = false;
            }       
        }
        
    }
}