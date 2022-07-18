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
    public ListNode deleteMiddle(ListNode head) {
        
        int countNode = 0 ;
        ListNode curr = head ; 
        while(curr!=null)
        {
            countNode++;
            curr=curr.next;
        }
        
        if(countNode==1)
        {
            return null ; 
        }
        int idx = countNode/2;
        
        boolean flag = true;
        
        ListNode prev = null ; 
        curr = head ; 
        ListNode next = head.next;
        
        while(flag)
        {
          if(idx==0)
          {
             prev.next = curr.next ; 
              flag = false ; 
          }
          else
          {
             prev = curr;
              curr = curr.next;
              idx--;
              // next=next.next;
          }
        }
        
        return head ; 
    }
}