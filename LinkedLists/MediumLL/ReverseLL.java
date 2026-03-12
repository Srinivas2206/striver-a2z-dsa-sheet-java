package LinkedLists.MediumLL;

public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode before = null;
        ListNode after = null;
        while (temp != null) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
        return before;
    }
}
