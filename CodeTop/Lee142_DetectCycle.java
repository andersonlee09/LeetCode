/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/17 21:16
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee142_DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode node = help(head);
        if (node == null) return null;
        int count = 1;
        ListNode temp = node.next;
        while (temp != node) {
            count++;
            temp = temp.next;
        }
        ListNode res = head;
        for (int i = 0; i < count; i++) {
            res = res.next;
        }
        while (res!= head) {
            head = head.next;
            res = res.next;
        }
        return res;
    }

    ListNode help(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode fast = head.next;
        while (fast != null) {
            if (fast == head) return head;
            fast = fast.next.next;
            head = head.next;
        }
        return null;
    }
}
