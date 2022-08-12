package matrices;

public class matrix3d {
    private double[][] matrix = new double[3][3];

    public matrix3d(double a11, double a12, double a13,
                    double a21, double a22, double a23,
                    double a31, double a32, double a33) {
        matrix[0][0] = a11;
        matrix[0][1] = a12;
        matrix[0][2] = a13;
        matrix[1][0] = a21;
        matrix[1][1] = a22;
        matrix[1][2] = a23;
        matrix[2][0] = a31;
        matrix[2][1] = a32;
        matrix[2][2] = a33;
    }

    public matrix3d multiplyMatrix3d (matrix3d _matrix) {
        /*
            [a11][a12][a13]   [b11][b12][b13]   [a11 * b11 + a12 * b21 + a13 * b31][a11 * b12 + a12 * b22 + a13 * b32][a11 * b13 + a12 * b23 + a13 * b33]
            [a21][a22][a23] * [b21][b22][b23] = [a21 * b11 + a22 * b21 + a23 * b31][a21 * b12 + a22 * b22 + a23 * b32][a21 * b13 + a22 * b23 + a23 * b33]
            [a31][a32][a33]   [b31][b32][b33]   [a31 * b11 + a32 * b21 + a33 * b31][a31 * b12 + a32 * b22 + a33 * b32][a31 * b13 + a32 * b23 + a33 * b33]
         */

        double a11 =  matrix[0][0];
        double a12 =  matrix[0][1];
        double a13 =  matrix[0][2];
        double a21 =  matrix[1][0];
        double a22 =  matrix[1][1];
        double a23 =  matrix[1][2];
        double a31 =  matrix[2][0];
        double a32 =  matrix[2][1];
        double a33 =  matrix[2][2];

        double b11 = _matrix.getMatrix11();
        double b12 = _matrix.getMatrix12();
        double b13 = _matrix.getMatrix13();
        double b21 = _matrix.getMatrix21();
        double b22 = _matrix.getMatrix22();
        double b23 = _matrix.getMatrix23();
        double b31 = _matrix.getMatrix31();
        double b32 = _matrix.getMatrix32();
        double b33 = _matrix.getMatrix33();

        return new matrix3d((a11 * b11) + (a12 * b21) + (a13 * b31),
                            (a11 * b12) + (a12 * b22) + (a13 * b32),
                            (a11 * b13) + (a12 * b23) + (a13 * b33),
                            (a21 * b11) + (a22 * b21) + (a23 * b31),
                            (a21 * b12) + (a22 * b22) + (a23 * b32),
                            (a21 * b13) + (a22 * b23) + (a23 * b33),
                            (a31 * b11) + (a32 * b21) + (a33 * b31),
                            (a31 * b12) + (a32 * b22) + (a33 * b32),
                            (a31 * b13) + (a32 * b23) + (a33 * b33));
    }

    public matrix3d addMatrix3d (matrix3d _matrix) {
        /*
            [a11][a12][a13]   [b11][b12][b13]   [a11 + b11][a12 + b12][a13 + b13]
            [a21][a22][a23] + [b21][b22][b23] = [a21 + b21][a22 + b22][a23 + b23]
            [a31][a32][a33]   [b31][b32][b33]   [a31 + b31][a32 + b32][a33 + b33]
         */

        double a11 =  matrix[0][0];
        double a12 =  matrix[0][1];
        double a13 =  matrix[0][2];
        double a21 =  matrix[1][0];
        double a22 =  matrix[1][1];
        double a23 =  matrix[1][2];
        double a31 =  matrix[2][0];
        double a32 =  matrix[2][1];
        double a33 =  matrix[2][2];

        double b11 = _matrix.getMatrix11();
        double b12 = _matrix.getMatrix12();
        double b13 = _matrix.getMatrix13();
        double b21 = _matrix.getMatrix21();
        double b22 = _matrix.getMatrix22();
        double b23 = _matrix.getMatrix23();
        double b31 = _matrix.getMatrix31();
        double b32 = _matrix.getMatrix32();
        double b33 = _matrix.getMatrix33();

        return new matrix3d((a11 + b11),
                            (a12 + b12),
                            (a13 + b13),
                            (a21 + b21),
                            (a22 + b22),
                            (a23 + b23),
                            (a31 + b31),
                            (a32 + b32),
                            (a33 + b33));
    }

    public matrix3d subtractMatrix3d (matrix3d _matrix) {
        /*
            [a11][a12][a13]   [b11][b12][b13]   [a11 - b11][a12 - b12][a13 - b13]
            [a21][a22][a23] - [b21][b22][b23] = [a21 - b21][a22 - b22][a23 - b23]
            [a31][a32][a33]   [b31][b32][b33]   [a31 - b31][a32 - b32][a33 - b33]
         */

        double a11 =  matrix[0][0];
        double a12 =  matrix[0][1];
        double a13 =  matrix[0][2];
        double a21 =  matrix[1][0];
        double a22 =  matrix[1][1];
        double a23 =  matrix[1][2];
        double a31 =  matrix[2][0];
        double a32 =  matrix[2][1];
        double a33 =  matrix[2][2];

        double b11 = _matrix.getMatrix11();
        double b12 = _matrix.getMatrix12();
        double b13 = _matrix.getMatrix13();
        double b21 = _matrix.getMatrix21();
        double b22 = _matrix.getMatrix22();
        double b23 = _matrix.getMatrix23();
        double b31 = _matrix.getMatrix31();
        double b32 = _matrix.getMatrix32();
        double b33 = _matrix.getMatrix33();

        return new matrix3d((a11 - b11),
                            (a12 - b12),
                            (a13 - b13),
                            (a21 - b21),
                            (a22 - b22),
                            (a23 - b23),
                            (a31 - b31),
                            (a32 - b32),
                            (a33 - b33));
    }

    //region GETTERS
    public matrix3d getMatrix3d () {
        return this;
    }
    public double[][] getMatrixArray3d () {
        return matrix;
    }
    public double getMatrix11 () {
        return matrix[0][0];
    }

    public double getMatrix12 () {
        return matrix[0][1];
    }

    public double getMatrix13 () {
        return matrix[0][2];
    }

    public double getMatrix21 () {
        return matrix[1][0];
    }

    public double getMatrix22 () {
        return matrix[1][1];
    }

    public double getMatrix23 () {
        return matrix[1][2];
    }

    public double getMatrix31 () {
        return matrix[2][0];
    }

    public double getMatrix32 () {
        return matrix[2][1];
    }

    public double getMatrix33 () {
        return matrix[2][2];
    }
    //endregion
}
