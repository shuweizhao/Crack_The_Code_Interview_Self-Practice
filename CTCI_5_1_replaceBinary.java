/**
 * Created by shuweizhao on 2/29/16.
 */
public class CTCI_5_1_replaceBinary {
    public int replaceBinary(int n, int m, int i, int j) {
        //invalid input exception
        int mask;
        if (j < 31) {
            mask = ~((1 << (j + 1)) - (1 << i));
        }
        else {
            mask = (1 << i) - 1;
        }
        return (n & mask) + (m << i);
    }
}
