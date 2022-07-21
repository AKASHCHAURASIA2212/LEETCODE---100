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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head ; 
        int count=1;
        while(temp!=null)
        {
          
            if(count>=left && count<=right)
            {
                st.push(temp.val);
            }
            else if(count>right)
            {
                temp=null ;
                break ;
            }
            temp = temp.next ; 
            count++;
        }
        
        temp = head ; 
        count=1;
        while(temp!=null)
        {
          
            if(count>=left && count<=right)
            {
                temp.val = st.pop();
            }
            else if(count>right)
            {
                temp = null ;
                break ;
            }
              temp = temp.next ; 
            count++;
        }
        
        return head ;
    }
}