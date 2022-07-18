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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        
        ListNode temp = head;
        
        if(temp.next==null)
        {
            return null;
        }
        
        while(temp!=null)
        {
          count++;
            temp=temp.next;
        }
        
        temp = head ;
        
        ListNode prev = head ; 
        
        int delete = count-n;
        
        if(delete==0)
        {
            head=head.next;
            return head;
        }
        boolean flag = true;
        
        while(flag)
        {
            if(delete==0)
            {
               prev.next = temp.next;
                flag=false;
            }
            else
            {
            prev = temp;
            temp = temp.next;
            delete--;
            }
           
        }
        
        return head ; 
    }
}