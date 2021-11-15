/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/14 23:33
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee114_Flatten {
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.left);
        flatten(root.right);
        TreeNode node = root;
        TreeNode left = root.left;
        root.right = root.left;
        root.left = null;
        while (node.right != null) {
            node = node.right;
        }
        node.right = left;
    }
}