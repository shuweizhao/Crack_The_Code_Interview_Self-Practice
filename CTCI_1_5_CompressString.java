/**
 * Created by shuweizhao on 2/19/16.
 */
import java.util.*;
public class CTCI_1_5_CompressString {
    public String compressString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        char prev = c[0];
        int cnt = 1;
        for (int i = 1; i < c.length; i++) {
            if (c[i] == prev) {
                cnt++;
            }
            else {
                sb.append(prev);
                sb.append(cnt);
                prev = c[i];
                cnt = 1;
            }
        }
        sb.append(prev).append(cnt);
        if (sb.length() >= s.length()) {
            return s;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        CTCI_1_5_CompressString ctci15 = new CTCI_1_5_CompressString();
        System.out.println(ctci15.compressString(""));
        System.out.println(ctci15.compressString("abcuspkgphlskdjlktjoisdlkjfng"));
        System.out.println(ctci15.compressString("aaaaaaaaaaaaaaaaa"));
        System.out.println(ctci15.compressString("abvkotmslgjbotbhhggkgkgkgkgkg"));
        System.out.println(ctci15.compressString("312hglsdfgopihkjkjkjsdhgitthghgh1468900321"));

    }

}
