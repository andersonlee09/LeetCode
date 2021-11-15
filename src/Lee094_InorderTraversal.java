import java.util.ArrayList;
import java.util.List;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/12 22:10
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee094_InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        mfs(root, res);
        return res;
    }

    public void mfs(TreeNode node, List<Integer> res) {
        if (node!=null) {
            res.add(node.val);
            mfs(node.left, res);
            mfs(node.right, res);
        }
    }
}
