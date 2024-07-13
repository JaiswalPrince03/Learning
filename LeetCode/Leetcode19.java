import LinkedList.ListNode;

public class Leetcode19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        
        ListNode p = head;
        int length = 0;
        while (p != null) {
            length++;
            p = p.next;
        }
        
        if (n > length) return head;
        
        if (n == length) return head.next;
        
        p = head;
        for (int i = 0; i < length - n - 1; i++) {
            p = p.next;
        }
        
        p.next = p.next.next;
        return head;
    }
}