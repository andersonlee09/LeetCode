/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/18 21:58
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee023_MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    public ListNode merge(ListNode[] listNodes, int left, int right) {
        if (left == right) return listNodes[left];
        int mid = (left + right) >> 1;
        return help(merge(listNodes, left, mid), merge(listNodes, mid + 1, right));
    }

    public ListNode help(ListNode node1, ListNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        if (node1.val < node2.val) {
            node1.next = help(node1.next, node2);
            return node1;
        } else {
            node2.next = help(node1, node2.next);
            return node2;
        }
    }
}
