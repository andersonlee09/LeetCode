/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/12 18:17
 * @purpose 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表
 * @ModifiedRecords null
 */
public class SwapTwoPairs_024 {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        ListNode node, temp;
        ListNode res = head;
        while (head!= null && head.next != null) {
            node = head.next;
            temp = head;
            temp.next = node.next;
            node.next = temp;
            head = head.next.next;
        }
        return res;
    }

}
