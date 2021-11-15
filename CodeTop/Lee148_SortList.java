/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/18 23:13
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee148_SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 循环结束后slow为中间节点
        fast = slow.next;
        slow.next = null;
        ListNode dummyNode = new ListNode();
        ListNode temp = dummyNode;
        while (slow != null && fast != null) {
            if (slow.val < fast.val) {
                temp.next = slow;
                slow = slow.next;
            } else {
                temp.next = fast;
                fast = fast.next;
            }
            temp = temp.next;
        }
        temp.next = slow == null ? fast : slow;
        return dummyNode.next;
    }
}
