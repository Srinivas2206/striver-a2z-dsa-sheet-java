package LinkedLists.MediumLL;

public class SortLLof0s1s2s {
    public ListNode sortList(ListNode head) {
        // YOUR CODE GOES HERE
        ListNode zeroHead = new ListNode(-1);
        ListNode oneHead = new ListNode(-1);
        ListNode twoHead = new ListNode(-1);
        ListNode zero = zeroHead, one = oneHead, two = twoHead;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == 0) {
                zero.next = curr;
                zero = zero.next;
            } else if (curr.val == 1) {
                one.next = curr;
                one = one.next;
            } else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }
}