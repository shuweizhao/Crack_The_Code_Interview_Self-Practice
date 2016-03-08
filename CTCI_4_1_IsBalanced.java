/**
 * Created by shuweizhao on 2/25/16.
 */
public class CTCI_4_1_IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return false;
        }
        return treeHeight(root) == -1 ? false : true;
    }

    public int treeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

}
