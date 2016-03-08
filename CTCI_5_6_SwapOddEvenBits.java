/**
 * Created by shuweizhao on 2/29/16.
 */
public class CTCI_5_6_SwapOddEvenBits {
    public int swapOddEvenBits(int x) {
        return ((x & 0xAAAAAAAA) >> 1) | ((x & 0x55555555) << 1);
    }
}
