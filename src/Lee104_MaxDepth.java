/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/14 20:41
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee104_MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) return 1;
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}
