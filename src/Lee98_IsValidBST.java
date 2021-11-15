/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/13 22:37
 * @purpose null
 * @ModifiedRecords 启发：有时候不需要以此节点和它的左右孩子节点为最终答案   也可以以此节点和它的父亲作为传递对象
 */
public class Lee98_IsValidBST {
    public static void main(String[] args) {
        System.out.println("int min:" + Integer.MIN_VALUE + "        int max:" + Integer.MAX_VALUE);
        System.out.println("long min:" + Long.MIN_VALUE + "        long max:" + Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root) {
        return help(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    public boolean help(TreeNode node, int min, int max) {
        if (node == null) return true;
        if (min > node.val || max < node.val) return false;
        return help(node.left, min, node.val) && help(node.right, node.val, max);
    }

}
