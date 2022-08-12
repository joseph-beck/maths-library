package matrices;

public class matrix2d {
    private double[][] matrix = new double[2][2];

    public matrix2d (double a11, double a12,
                     double a21, double a22) {
        matrix[0][0] = a11;
        matrix[0][1] = a12;
        matrix[1][0] = a21;
        matrix[1][1] = a22;
    }

    public matrix2d multiplyMatrix2d (matrix2d _matrix) {
        /*
            [a11][a12] * [b11][b12] = [a11 * b11 + a12 * b21][a11 * b12 + a12 * b22]
            [a21][a22]   [b21][b22]   [a21 * b11 + a22 * b21][a21 * b12 + a22 * b22]
         */

        double a11 = matrix[0][0];
        double a12 = matrix[0][1];
        double a21 = matrix[1][0];
        double a22 = matrix[1][1];

        double b11 = _matrix.get11();
        double b12 = _matrix.get12();
        double b21 = _matrix.get21();
        double b22 = _matrix.get22();

        return new matrix2d(    ((a11 * b11) + (a12 * b21)),
                                ((a11 * b12) + (a12 * b22)),
                                ((a21 * b11) + (a22 * b21)),
                                ((a21 * b12) + (a22 * b22)));
    }

    public matrix2d addMatrix2d (matrix2d _matrix) {
        /*
            [a11][a12] + [b11][b12] = [a11 + b11][a12 + b12]
            [a21][a22]   [b21][b22]   [a21 + b21][a22 + b22]
         */

        double a11 = matrix[0][0];
        double a12 = matrix[0][1];
        double a21 = matrix[1][0];
        double a22 = matrix[1][1];

        double b11 = _matrix.get11();
        double b12 = _matrix.get12();
        double b21 = _matrix.get21();
        double b22 = _matrix.get22();

        return new matrix2d(    (a11 + b11),
                                (a12 + b12),
                                (a21 + b21),
                                (a22 + b22));
    }

    public matrix2d substractMatrix2d (matrix2d _matrix) {
        /*
            [a11][a12] + [b11][b12] = [a11 - b11][a12 - b12]
            [a21][a22]   [b21][b22]   [a21 - b21][a22 - b22]
         */

        double a11 = matrix[0][0];
        double a12 = matrix[0][1];
        double a21 = matrix[1][0];
        double a22 = matrix[1][1];

        double b11 = _matrix.get11();
        double b12 = _matrix.get12();
        double b21 = _matrix.get21();
        double b22 = _matrix.get22();

        return new matrix2d(    (a11 - b11),
                                (a12 - b12),
                                (a21 - b21),
                                (a22 - b22));
    }

    //region GETTERS
    public double[][] getMatrixArray2d () {
        return matrix;
    }
    public matrix2d getMatrix2d () {
        return this;
    }
    public double get11() {
        return matrix[0][0];
    }

    public double get12() {
        return matrix[0][1];
    }

    public double get21() {
        return matrix[1][0];
    }

    public double get22() {
        return matrix[1][1];
    }
    //endregion
}
