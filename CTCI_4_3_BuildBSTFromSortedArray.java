/**
 * Created by shuweizhao on 2/25/16.
 */
public class CTCI_4_3_BuildBSTFromSortedArray {
    public TreeNode BuildBSTFromSortedArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return BuildBSTFromSortedArray(nums, 0, nums.length - 1);
    }

    private TreeNode BuildBSTFromSortedArray(int[] nums, int start, int end) {
        if (start == end) {
            return new TreeNode(nums[start]);
        }
        TreeNode root = null;
        if (start < end) {
            int mid = start + (end - start) / 2;
            root = new TreeNode(nums[mid]);
            root.left = BuildBSTFromSortedArray(nums, start, mid - 1);
            root.right = BuildBSTFromSortedArray(nums, mid + 1, end);
        }
        return root;
    }


}
