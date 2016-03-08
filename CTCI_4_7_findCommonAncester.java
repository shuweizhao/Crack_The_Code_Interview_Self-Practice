/**
 * Created by shuweizhao on 2/26/16.
 */
public class CTCI_4_7_findCommonAncester {
    public TreeNode findCommonAncester(TreeNode root, TreeNode a, TreeNode b) {
        if (root == null || a == null || b == null) {
            return null;
        }
        if (root == a || root == b) {
            return root;
        }
        TreeNode left = findCommonAncester(root.left, a, b);
        TreeNode right = findCommonAncester(root.right, a, b);

        if (left != null && right != null) {
            return root;
        }
        if (left != null) {
            return left;
        }
        if (right != null) {
            return right;
        }
        return null;
    }
}
