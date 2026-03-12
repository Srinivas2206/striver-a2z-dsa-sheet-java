package LinkedLists.MediumLL;

public class RemoveNthNodeLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length += 1;
        }
        if (n == length)
            return head.next;
        int k = length - n;
        temp = head;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
