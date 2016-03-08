/**
 * Created by shuweizhao on 2/26/16.
 */
import java.util.*;
public class CTCI_4_8_pathSum {
    public List<String> pathSum(TreeNode root, int sum) {
        List<String> res = new ArrayList<String>();
        if (root == null) {
            return res;
        }
        int depth = getDepth(root);
        int[] path = new int[depth];
        findSum(root, res, path, 0, 0);
        return res;
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }


    private void findSum(TreeNode root, List<String> res, int[] path, int level, int target) {
        if (root == null) {
            return;
        }
        path[level] = root.val;
        int sum = 0;
        for (int i = level; i >= 0; i--) {
            sum += path[level];
            if (sum == target) {
                res.add(toString(path, level, i));
            }
        }

        findSum(root.left, res, path, level + 1, target);
        findSum(root.right, res, path, level + 1, target);

        path[level] = Integer.MIN_VALUE;
    }

    private String toString(int[] path, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i >= end; i--) {
            sb.append(path[i]);
        }
        return sb.toString();
    }

}
