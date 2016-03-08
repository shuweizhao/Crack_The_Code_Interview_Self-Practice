/**
 * Created by shuweizhao on 2/19/16.
 */
import java.util.*;
public class CTCI_1_4_SpaceReplacement {
    public int SpaceReplacement(char[] c, int len) {
        if (len <= 0) {
            return len;
        }
        int spaceCnt = 0;
        for(int i = 0; i < len; i++) {
            if (c[i] == ' ') {
                spaceCnt++;
            }
        }
        int newLen = len + 2 * spaceCnt;
        for (int i = len - 1; i >= 0; i--) {
            int index = i + 2 * spaceCnt;
            if (c[i] == ' ') {
                c[index--] = '0';
                c[index--] = '2';
                c[index--] = '%';
                spaceCnt--;
            }
            else {
                c[index] = c[i];
            }
        }
        return newLen;
    }

    public static void main(String[] args) {
        CTCI_1_4_SpaceReplacement ctci14 =  new CTCI_1_4_SpaceReplacement();
        char[] c = new char[200];
        String s = "My name is JUICY";
        char[] cc = s.toCharArray();
        for (int i = 0; i < cc.length; i++) {
            c[i] = cc[i];
        }
        System.out.println(ctci14.SpaceReplacement(c, cc.length));
    }


}
