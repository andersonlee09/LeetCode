import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/17 15:25
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee103_ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        int n = 1;
        boolean resverve = false;
        queue.add(root);
        while (!queue.isEmpty()) {
            n = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (resverve) {
                    list.add(node.val);
                }else {
                    list.add(0, node.val);
                }
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!= null){
                    queue.add(node.right);
                }
            }
            res.add(list);
            resverve = !resverve;
        }
        return res;
    }
}
