/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/4 21:48
 * @purpose null
 * @ModifiedRecords null
 */
public class DeleteTheNodeOfLinkList_019 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = head;
        ListNode secondNode = head;
// 如果删除的是第一个节点则需要直接返回头节点
        for (int i = 0; i < n; i++) {
            head = head.next;
        }
        ListNode firstNode = head;
        while (head.next != null) {
            head = head.next;
            secondNode = secondNode.next;
        }
        secondNode = secondNode.next;
        return res;
    }

    public static void main(String[] args) {
        DeleteTheNodeOfLinkList_019 demo = new DeleteTheNodeOfLinkList_019();

    }
}
