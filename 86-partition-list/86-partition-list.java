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
    public ListNode partition(ListNode head, int x) {
        
        if(head==null)
        {
            return null ; 
        }
        else if(head.next==null)
        {
            return head ; 
        }
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        while(head!=null)
        {
            if(head.val<x)
            {
                q1.add(head.val);
            }
            else
            {
                q2.add(head.val);
            }
            head= head.next ;
        }
        
        
        ListNode newhead = null , temp = newhead ;
        while(q1.size()>0)
        {
            int vall = q1.remove();
            if(newhead==null)
            {
                ListNode newnode = new ListNode(vall);
                newhead  = newnode ; 
                temp = newnode ;
            }
            else
            {
                ListNode newnode = new ListNode(vall);
                temp.next = newnode ; 
                temp = newnode ; 
            }  
        }
        
        while(q2.size()>0)
        {
               int vall = q2.remove();
       
            if(newhead==null)
            {
                ListNode newnode = new ListNode(vall);
                newhead  = newnode ; 
                temp = newnode ;
            }
            else
            {
                ListNode newnode = new ListNode(vall);
                temp.next = newnode ; 
                temp = newnode ; 
            }  
        }
        
        return newhead ;
        
    }
}