package LinkedLists.MediumLL;

public class AddOneLL {
    public ListNode addOne(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode lastNonNine = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val != 9) {
                lastNonNine = curr;
            }
            curr = curr.next;
        }
        lastNonNine.val++;
        curr = lastNonNine.next;
        while (curr != null) {
            curr.val = 0;
            curr = curr.next;
        }
        if (dummy.val == 1)
            return dummy;
        return dummy.next;

    }
}
