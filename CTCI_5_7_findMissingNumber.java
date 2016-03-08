/**
 * Created by shuweizhao on 2/29/16.
 */
import java.util.*;
public class CTCI_5_7_findMissingNumber {
    public int findMissingNum(ArrayList<Integer> nums) {
        return findMissingNum(nums, 0);
    }

    private int findMissingNum(ArrayList<Integer> nums, int colomn) {
        if (colomn >= 32) {
            return 0;
        }
        ArrayList<Integer> oneBits = new ArrayList<>(nums.size() / 2);
        ArrayList<Integer> zeroBits = new ArrayList<>(nums.size() / 2);


        for (Integer i : nums) {
            if (i.fetch(colomn) == 1) {
                oneBits.add(i);
            }
            else {
                zeroBits.add(i);
            }
        }

        if (oneBits.size() >= zeroBits.size()) {
            int v = findMissingNum(nums, colomn + 1);
            return v << 1 | 0;
        }
        else {
            int v = findMissingNum(nums, colomn + 1);
            return v << 1 | 1;
        }
    }

}
