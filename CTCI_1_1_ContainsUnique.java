/**
 * Created by shuweizhao on 2/19/16.
 */
import java.util.*;
public class CTCI_1_1_ContainsUnique {
    public boolean CTCI_1_1_ContainsUnique(String s) {
        //exception handle
        if (s == null || s.length() == 0) {
            return true;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            }
            else {
                return false;
            }
        }
        return true;
    }

    public boolean CTCI_1_1_ContainsUnique2(String s) {
        //exception handle
        if (s == null || s.length() == 0) {
            return true;
        }
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for (int i = 1; i < c.length; i++) {
            if (c[i] == c[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CTCI_1_1_ContainsUnique CTCI11 = new CTCI_1_1_ContainsUnique();
        //test cases
        System.out.println(CTCI11.CTCI_1_1_ContainsUnique2(null));
        System.out.println(CTCI11.CTCI_1_1_ContainsUnique2(""));
        System.out.println(CTCI11.CTCI_1_1_ContainsUnique2("absjfghdks"));
        System.out.println(CTCI11.CTCI_1_1_ContainsUnique2("aaaaaaaaaaaa"));
        System.out.println(CTCI11.CTCI_1_1_ContainsUnique2("apsojtugjssss"));
    }


}
