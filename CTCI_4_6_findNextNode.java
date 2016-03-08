/**
 * Created by shuweizhao on 2/25/16.
 */
public class CTCI_4_6_findNextNode {
    public TreeNode2 findNextNode(TreeNode2 root) {
        if (root == null) {
            return null;
        }
        //if root has a right child
        if (root.right != null) {
            TreeNode2 node = root.right;
            //get the leftest node;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }
        else {
            TreeNode2 parent = root.parent;
            //retrieve back to the toppest node until the node = parent.left return parent
            while (parent != null && parent.left != root) {
                root = root.parent;
            }
            return parent;
        }
    }


}
