/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/12 22:14
 * @purpose null
 * @ModifiedRecords null
 */

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
