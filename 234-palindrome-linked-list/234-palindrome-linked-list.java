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
    
    public ListNode Reverse(ListNode head)
    {
        if(head.next==null)
        {
            return head ;
        }
        ListNode prev = null ,curr = head , next = head.next ;
        
        while(next!=null)
        {
            next = curr.next ; 
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        return prev ;
    }
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow =head ,fast = head ;
        
        while(fast!=null && fast.next!=null)
        {   System.out.println("slow-->"+slow.val);
           slow = slow.next ; 
         System.out.println("slow-->"+slow.val);
            fast = fast.next.next ;
        }
        
        ListNode nhead = Reverse(slow);
        
        // System.out.println("hval-->"+head.val+" nhval-->"+nhead.val);

        while( head!=null && nhead!=null)
        {
            System.out.println("hval-->"+head.val+" nhval-->"+nhead.val);
            if(head.val!=nhead.val)
            {
                return false ; 
            }
            head = head.next ;
            nhead = nhead.next ;
        }
        
        if(head!=null)
        {
          if(head.next!=null)
          {
              return false;
          }
        }
        
        if(nhead!=null)
        {
          if(nhead.next!=null)
          {
              return false;
          }
        }
        
        return true ; 
    }
}