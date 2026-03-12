package LinkedLists.MediumLL;

public class LengthofLoopLL {
    public int findLengthOfLoop(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                int count = 1;
                slow = slow.next;
                while (slow != fast) {
                    slow = slow.next;
                    count++;
                }
                return count;

            }
        }
        return 0;
    }
}
