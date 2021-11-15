import java.util.*;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/14 20:49
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee102_LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        int n;
        queue.add(root);
        while (!queue.isEmpty()) {
            n = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!= null){
                    queue.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }

}
