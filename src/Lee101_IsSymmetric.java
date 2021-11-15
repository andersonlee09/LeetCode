/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/14 20:25
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee101_IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return help(root.left, root.right);
    }

    public boolean help(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return help(left.left, right.right) && help(left.right, right.left);
    }
}
