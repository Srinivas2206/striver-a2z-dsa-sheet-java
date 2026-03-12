package LinkedLists.MediumLL;

public class PalindromeLL {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null)
            return true;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode before = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
        return before;
    }
}