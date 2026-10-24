
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int total = 0;
        int carry = 0;

        while(l1!=null||l2!=null||carry!=0){
            total = carry;

            if(l1!=null){
                total += l1.val;
                l1 = l1.next;
            }

            if(l2!=null){
                total += l2.val;
                l2=l2.next;
            }

            carry = total/10;
            total = total%10;

            temp.next = new ListNode(total);
            temp = temp.next;
        }
        
        return dummy.next;
    }
}
