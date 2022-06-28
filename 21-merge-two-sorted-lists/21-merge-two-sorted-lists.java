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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head ; 
        
        if(list1==null && list2==null)return null;
        
        if(list1==null || list2==null){
           return list1==null ? list2 : list1 ;
        }
        
        while(list1!=null && list2!=null)
        {
            int v1 = list1.val;
            int v2 = list2.val;
            
            if(v1<=v2)
            {
                tail.next = list1;
                list1=list1.next;
            }
            else
            {
                tail.next = list2;
                list2=list2.next; 
            }
            
            tail = tail.next;
            
        }
        
        while(list1!=null)
        {
            tail.next = list1;
            list1=list1.next;
            tail=tail.next;
        }
        
           while(list2!=null)
        {
            tail.next = list2;
            list2=list2.next;
            tail=tail.next;
        }
        
        return head.next;
    }
}