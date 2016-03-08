/**
 * Created by shuweizhao on 2/29/16.
 */
public class CTCI_5_5_FlipBits {
    public int flipBits(int A,  int B) {
        int cnt = 0;
        for (int s = A ^ B; s != 0; s >>= 1) {
            if ((s & 1) == 1) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        CTCI_5_5_FlipBits ctci55 = new CTCI_5_5_FlipBits();
        System.out.println(ctci55.flipBits(31,  14));
    }
}
