/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/1 16:25
 * @purpose null
 * @ModifiedRecords null
 */
public class toSumTwoNumber_002 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    /*
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            ListNode newNode = new ListNode(0);
            ListNode head = newNode;
            while (l1 != null && l2 != null) {
                if (l1.val + l2.val > 9) {
                    newNode.val += (l1.val + l2.val) % 10;
                    newNode.next = new ListNode(1);
                    newNode = newNode.next;
                } else {
                    newNode.val += l1.val + l2.val;
                    newNode.next = new ListNode(0);
                    newNode = newNode.next;
                }
                l1 = l1.next;
                l2 = l2.next;
            }
            while (l1 != null) {
                if (l1.val + newNode.val > 9) {
                    newNode.val += (l1.val + newNode.val) % 10;
                    newNode.next = new ListNode(1);
                    newNode = newNode.next;
                } else {
                    newNode.val += l1.val + newNode.val;
                    newNode.next = new ListNode(0);
                    newNode = newNode.next;
                }
                l1 = l1.next;
            }
            while (l2 != null) {
                if (l2.val + newNode.val > 9) {
                    newNode.val += (l2.val + newNode.val) % 10;
                    newNode.next = new ListNode(1);
                    newNode = newNode.next;
                } else {
                    newNode.val += l2.val + newNode.val;
                    newNode.next = new ListNode(0);
                    newNode = newNode.next;
                }
                l2 = l2.next;
            }
            ListNode newHead = head;
            while (head.next.next != null) {
                head = head.next;
            }
            head.next = null;
            return newHead;
        }
    */
    /*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;  // carry 为要赋给子孙后代的值
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return root.next;
    }
*/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curs = new ListNode(0);
        ListNode root = curs;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int que = val1 + val2 + carry;
            carry = que / 10;
            ListNode son = new ListNode(que % 10);
            curs.next = son;
            curs = son;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return root.next;
    }

    public static void main(String[] args) {
        ListNode l1, l2;

        ListNode node1 = new ListNode(2);
        l1 = node1;
        node1.next = new ListNode(4);
        node1 = node1.next;
        node1.next = new ListNode(3);

        ListNode node2 = new ListNode(5);
        l2 = node2;
        node2.next = new ListNode(6);
        node2 = node2.next;
        node2.next = new ListNode(4);

        toSumTwoNumber_002 demo = new toSumTwoNumber_002();
        ListNode result = demo.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
