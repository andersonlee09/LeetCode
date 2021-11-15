/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/4 23:36
 * @purpose null
 * @ModifiedRecords null
 */
public class MergeTwoLinkLists_021 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        MergeTwoLinkLists_021 demo = new MergeTwoLinkLists_021();

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else {
            l2 = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
