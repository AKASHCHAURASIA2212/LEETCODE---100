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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode head = l3;
        ListNode tail = l3;
        int carry = 0 ;
        while(l1!=null && l2!=null)
        {
            int v1 = l1.val;
            l1=l1.next;
            int v2 = l2.val;
            l2=l2.next;
            int sum = v1+v2+carry;
            
            if(sum>9)
            {
                carry=1;
                sum=sum%10;
            }
            else{
               carry=0;
            }
            
            ListNode newnode = new ListNode(sum);
            tail.next = newnode;
            tail = newnode;
            sum=0;

        }
        
        while(l1!=null)
        {
            int v1 = l1.val;
            l1=l1.next;
            
            int sum = v1+carry;
            
            if(sum>9)
            {
                carry=1;
                sum=sum%10;
            }
            else{
               carry=0;
            }
            
            ListNode newnode = new ListNode(sum);
            tail.next = newnode;
            tail = newnode;
        }
        
            while(l2!=null)
        {
            int v2 = l2.val;
            l2=l2.next;
            
            int sum = v2+carry;
            
            if(sum>9)
            {
                carry=1;
                sum=sum%10;
            }
            else{
               carry=0;
            }
            
            ListNode newnode = new ListNode(sum);
            tail.next = newnode;
            tail = newnode;
        }
        
        if(carry!=0)
        {
            ListNode newnode = new ListNode(carry);
            tail.next = newnode;
            tail = newnode;
        }
        
        return head.next;
    }
}