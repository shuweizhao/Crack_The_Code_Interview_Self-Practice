/**
 * Created by shuweizhao on 2/25/16.
 */
public class CTCI_4_5_IsBST {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean isBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.val <= min || root.val >= max) {
            return false;
        }

        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }

}
