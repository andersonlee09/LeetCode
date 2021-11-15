/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/16 21:06
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee206_ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = reverseList(head.next);
        node.next.next = node.next;
        node.next = null;
        return node;
    }
}
