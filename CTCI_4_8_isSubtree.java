/**
 * Created by shuweizhao on 2/26/16.
 */
public class CTCI_4_8_isSubtree {
        public boolean isSubtree(TreeNode T1, TreeNode T2) {
            // write your code here
            if (T1 == null && T2 == null) {
                return true;
            }
            if (T1 == null) {
                return false;
            }
            if (T2 == null) {
                return true;
            }
            if (T1.val == T2.val) {
                if (matchTree(T1, T2)) {
                    return true;
                }
            }
            return isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
        }

        private boolean matchTree(TreeNode T1, TreeNode T2) {
            if (T1 == null && T2 == null) {
                return true;
            }
            if (T1 == null || T2 == null) {
                return false;
            }

            return (T1.val == T2.val) &&
                    matchTree(T1.left, T2.left) &&
                    matchTree(T1.right, T2.right);
        }

}
