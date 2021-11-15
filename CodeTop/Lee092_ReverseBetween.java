/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/17 18:27
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee092_ReverseBetween {
    public ListNode reverseBetween(ListNode head, int left, int right) {
         ListNode res = new ListNode();
         res.next = head;
        ListNode pre = res;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode node = pre.next;
        for (int i = 0; i < right - left; i++) {
            ListNode next = node.next;
            node.next = next.next;
            next.next = node;  // next.next = node是错误的  为什么？ 因为这里pre.node是不断变化的，但是node不会变化， 所以 pre.next 只会在第一次循环正确，其他情况就会出错
            pre.next = next;
        }
        return res.next;
    }
}
