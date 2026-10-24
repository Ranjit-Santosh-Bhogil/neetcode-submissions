
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int total = 0;
        int carry = 0;

        while (l1 != null && l2 != null) {
            total = l1.val + l2.val + carry;

            carry = total / 10;
            total = total % 10;

            temp.next = new ListNode(total);
            temp = temp.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 != null) {
            while (l1 != null) {
                total = l1.val + carry;
                carry = total / 10;
                total = total % 10;

                temp.next = new ListNode(total);
                temp = temp.next;

                l1 = l1.next;
            }
        } else {
            while (l2 != null) {
                total = l2.val + carry;
                carry = total / 10;
                total = total % 10;

                temp.next = new ListNode(total);
                temp = temp.next;

                l2 = l2.next;
            }
        }

        if (carry != 0) {
            temp.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
