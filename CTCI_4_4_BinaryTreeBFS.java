/**
 * Created by shuweizhao on 2/25/16.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CTCI_4_4_BinaryTreeBFS {
    public ArrayList<ArrayList<Integer>> BinaryTreeBFS(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }

}
