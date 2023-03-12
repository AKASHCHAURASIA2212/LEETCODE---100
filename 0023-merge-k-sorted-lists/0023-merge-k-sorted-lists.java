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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode Head = null,tail=null;
         int size = lists.length;
        int idx = 0;
        while(idx<size){
            ListNode lhead = lists[idx];
            if(Head!=null){
                tail.next = lhead;
            }
            
            while(lhead!=null){
                if(Head==null){
                    Head=lhead;
                    tail = Head;
                }else{
                    tail = lhead;
                }
                lhead=lhead.next;
            }
            idx++;
        }
        
        ArrayList<Integer> li = new ArrayList<>();
        
        while(Head!=null){
            li.add(Head.val);
            Head = Head.next;
        }
        Collections.sort(li); 
        Head=null;tail=null;
        System.out.println(li);
        while(li.size()>0){
            ListNode newnode = new ListNode(li.remove(0));
            if(Head==null){
                Head=newnode;
                tail = Head;
            }else{
                tail.next = newnode;
                tail = newnode;
            }
        }
        
        return Head;
        
    }
}