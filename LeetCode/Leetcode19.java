package Learning.LinkedList;
public class Leetcode19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head, q = head;
        for(int i=0;i<n;i++){
            p = p.next;
        }
        if(p==null){
            head = head.next;

        }
        while(p.next!=null){
            p=p.next;
            q=q.next;
        }
        q.next = q.next.next;
        // Additional logic to be implemented here
        return head; // Placeholder return statement
    }
}
