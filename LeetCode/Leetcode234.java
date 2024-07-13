import LinkedList.ListNode;

public class Leetcode234 {

    public boolean isPalindrome(ListNode head) {
        ListNode mid = head;
        ListNode end = head;
        while (end != null && end.next != null) {
            mid = mid.next;
            end = end.next.next;
        }
        ListNode prev = null;
        ListNode current = mid;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode p1 = head;
        ListNode p2 = prev;
        while (p2 != null) {
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}
