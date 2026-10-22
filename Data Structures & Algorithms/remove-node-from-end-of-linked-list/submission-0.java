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
        ListNode dummy = new ListNode(0, head);

        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int ith = len - n; // position of node before the target,
                           // counting from dummy at position 0

        ListNode node = dummy;

        while (ith > 0) {
            node = node.next;
            ith--;
        }

        node.next = node.next.next;

        return dummy.next;
    }
}
