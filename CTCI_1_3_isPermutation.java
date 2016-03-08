/**
 * Created by shuweizhao on 2/19/16.
 */
public class CTCI_1_3_isPermutation {
    //determins whether s1 is permutation of anather
    public boolean CTCI_1_3_isPermutation(String s1, String s2) {
        //if one is null no permutation available
        if (s1 == null || s2 == null) {
            return false;
        }
        //if two string share diff lengths, false
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] cDict = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            cDict[(int)s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            cDict[(int)s2.charAt(i)]--;
        }
        for (int i = 0; i < cDict.length; i++) {
            if (cDict[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        CTCI_1_3_isPermutation ctci13 = new CTCI_1_3_isPermutation();
        System.out.println(ctci13.CTCI_1_3_isPermutation(null, null));
        System.out.println(ctci13.CTCI_1_3_isPermutation("123", null));
        System.out.println(ctci13.CTCI_1_3_isPermutation("", ""));
        System.out.println(ctci13.CTCI_1_3_isPermutation("123", "3214"));
        System.out.println(ctci13.CTCI_1_3_isPermutation("123", "421"));
        System.out.println(ctci13.CTCI_1_3_isPermutation("123", "321"));



    }

}
