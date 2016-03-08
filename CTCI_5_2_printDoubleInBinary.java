/**
 * Created by shuweizhao on 2/29/16.
 */
public class CTCI_5_2_printDoubleInBinary {
    public void printDoubleInBinary(double num) {
        if (num < 0.0 || num > 1.0) {
            return;
        }
        StringBuilder res = new StringBuilder();
        res.append(".");
        while (num > 0) {
            if (res.length() >= 32) {
                System.out.println("Error!");
                return;
            }
            double r = num * 2;
            if (r >= 1) {
                res.append(1);
                num = r - 1;
            }
            else {
                res.append(0);
                num = r;
            }
        }
        System.out.println(res.toString());
    }

    public static void main(String[] args) {
        CTCI_5_2_printDoubleInBinary ctci52 = new CTCI_5_2_printDoubleInBinary();
        ctci52.printDoubleInBinary(0.625);
    }


}
