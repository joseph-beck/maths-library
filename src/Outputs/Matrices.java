package Outputs;

import Matrices.*;

public class Matrices {
    public static void outputMatrix2d (Matrix2d _matrix) {
        double[][] matrixArray = _matrix.getMatrixArray2d();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixArray[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void outputMatrix2f (Matrix2f _matrix) {
        float[][] matrixArray = _matrix.getMatrixArray2f();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixArray[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void outputMatrix2i (Matrix2i _matrix) {
        int[][] matrixArray = _matrix.getMatrixArray2i();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixArray[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
