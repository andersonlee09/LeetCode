/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/17 14:03
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee141_HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            if (head == fast) return true;
            head = head.next;
            fast = fast.next.next;
        }
        return false;
    }
}
