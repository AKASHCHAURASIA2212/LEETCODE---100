class Solution {
    private ListNode head;

    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        int count = 0;
        int result = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            // Randomly choose a node to be the result with probability 1/count
            if (new Random().nextInt(count) == 0) {
                result = current.val;
            }
            current = current.next;
        }
        return result;
    }
}