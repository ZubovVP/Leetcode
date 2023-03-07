package org.zubov.solutions.easy;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            result += mat[i][i];
            result += mat[mat.length - i - 1][i];
        }
        if (mat.length % 2 != 0) {
            result -= mat[mat.length / 2][mat.length / 2];
        }
        return result;
    }
}
