/**
 * Created by shuweizhao on 2/19/16.
 */
public class CTCI_1_7_Set_Zeroes {
    public void setZeros(int[][] matrix) {
        if (matrix == null || matrix.length == 0|| matrix[0].length == 0) {
            return;
        }
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        boolean firstRow = false, firstCol = false;
        for (int i = 0; i < rowLen; i++) {
            firstRow |= matrix[i][0] == 0;
        }
        for (int i = 0; i < colLen; i++) {
            firstCol |= matrix[0][i] == 0;
        }

        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRow) {
            for (int i = 0; i < rowLen; i++) {
                matrix[i][0] = 0;
            }
        }

        if (firstCol) {
            for (int i = 0; i < colLen; i++) {
                matrix[0][i] = 0;
            }
        }
    }
    public static void main(String[] args) {}

}
