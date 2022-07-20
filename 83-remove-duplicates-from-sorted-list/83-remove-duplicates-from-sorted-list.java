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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null)
        {
            return null;
        }
        else if(head.next==null)
        {
            return head;
        }
        ListNode curr = head.next ,prev =  head ; 
        
        while(curr!=null && prev!=null)
        {
           if(prev.val==curr.val)
           {
               prev.next = curr.next;
               curr = curr.next ;   
           }
            else
            {
                prev = curr ;
                curr = curr.next ;
            }
        }
        
        return head ;
    }
}