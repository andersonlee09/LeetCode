/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/17 14:26
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee160_GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode A = headA, B = headB;
        while(A != B) {
            A = A == null ? headB :A.next;
            B = B == null ? headA : B.next;
        }
        return A;
    }
}
