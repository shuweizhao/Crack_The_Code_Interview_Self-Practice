/**
 * Created by shuweizhao on 2/19/16.
 */
public class CTCI_1_6_Rotate_Image {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int tmp = '0';
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        for (int i = 0; i < rowLen / 2; i++) {
            for (int j = 0; j < (colLen + 1) / 2; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[rowLen - 1 - j][i];//1st = 4th
                matrix[rowLen - 1 - j][i] = matrix[rowLen - 1 - i][rowLen - 1 - j];//4th = 3rd
                matrix[rowLen - 1 - i][rowLen - 1 - j] = matrix[j][rowLen - 1 - i];//3rd = 2nd
                matrix[j][rowLen - 1 - i] = tmp;//2nd = 1st
            }
        }
    }
    public static void main(String[] args) {
        CTCI_1_6_Rotate_Image ctci16 = new CTCI_1_6_Rotate_Image();
//        ctci16.RoatateImage();
    }

}
