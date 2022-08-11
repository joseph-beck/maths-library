package matrices;

public class matrix4d {
    private double[][] matrix = new double[4][4];

    public matrix4d(double a11, double a12, double a13, double a14,
                    double a21, double a22, double a23, double a24,
                    double a31, double a32, double a33, double a34,
                    double a41, double a42, double a43, double a44) {
        matrix[0][0] = a11;
        matrix[0][1] = a12;
        matrix[0][2] = a13;
        matrix[0][3] = a14;
        matrix[1][0] = a21;
        matrix[1][1] = a22;
        matrix[1][2] = a23;
        matrix[1][3] = a24;
        matrix[2][0] = a31;
        matrix[2][1] = a32;
        matrix[2][2] = a33;
        matrix[2][3] = a34;
        matrix[3][0] = a41;
        matrix[3][1] = a42;
        matrix[3][2] = a43;
        matrix[3][3] = a44;
    }

    public matrix4d multiplyMatrix4d (matrix4d _matrix) {
        /*
            [a11][a12][a13][a14]   [b11][b12][b13][b14]   [][][][]
            [a21][a22][a23][a24] * [b21][b22][b23][b24] = [][][][]
            [a31][a32][a33][a34]   [b31][b32][b33][b34]   [][][][]
            [a41][a42][a43][a44]   [b41][b42][b43][b44]   [][][][]
         */

        double a11 = matrix[0][0];
        double a12 = matrix[0][1];
        double a13 = matrix[0][2];
        double a14 = matrix[0][3];
        double a21 = matrix[1][0];
        double a22 = matrix[1][1];
        double a23 = matrix[1][2];
        double a24 = matrix[1][3];
        double a31 = matrix[2][0];
        double a32 = matrix[2][1];
        double a33 = matrix[2][2];
        double a34 = matrix[2][3];
        double a41 = matrix[3][0];
        double a42 = matrix[3][1];
        double a43 = matrix[3][2];
        double a44 = matrix[3][3];

        double b11 = _matrix.get11();
        double b12 = _matrix.get12();
        double b13 = _matrix.get13();
        double b14 = _matrix.get14();
        double b21 = _matrix.get21();
        double b22 = _matrix.get22();
        double b23 = _matrix.get23();
        double b24 = _matrix.get24();
        double b31 = _matrix.get31();
        double b32 = _matrix.get32();
        double b33 = _matrix.get33();
        double b34 = _matrix.get34();
        double b41 = _matrix.get41();
        double b42 = _matrix.get42();
        double b43 = _matrix.get43();
        double b44 = _matrix.get44();

        return null;
    }

    public matrix4d addMatrix4d (matrix4d _matrix) {
        /*
            [a11][a12][a13][a14]   [b11][b12][b13][b14]   [][][][]
            [a21][a22][a23][a24] + [b21][b22][b23][b24] = [][][][]
            [a31][a32][a33][a34]   [b31][b32][b33][b34]   [][][][]
            [a41][a42][a43][a44]   [b41][b42][b43][b44]   [][][][]
         */

        double a11 = matrix[0][0];
        double a12 = matrix[0][1];
        double a13 = matrix[0][2];
        double a14 = matrix[0][3];
        double a21 = matrix[1][0];
        double a22 = matrix[1][1];
        double a23 = matrix[1][2];
        double a24 = matrix[1][3];
        double a31 = matrix[2][0];
        double a32 = matrix[2][1];
        double a33 = matrix[2][2];
        double a34 = matrix[2][3];
        double a41 = matrix[3][0];
        double a42 = matrix[3][1];
        double a43 = matrix[3][2];
        double a44 = matrix[3][3];

        double b11 = _matrix.get11();
        double b12 = _matrix.get12();
        double b13 = _matrix.get13();
        double b14 = _matrix.get14();
        double b21 = _matrix.get21();
        double b22 = _matrix.get22();
        double b23 = _matrix.get23();
        double b24 = _matrix.get24();
        double b31 = _matrix.get31();
        double b32 = _matrix.get32();
        double b33 = _matrix.get33();
        double b34 = _matrix.get34();
        double b41 = _matrix.get41();
        double b42 = _matrix.get42();
        double b43 = _matrix.get43();
        double b44 = _matrix.get44();

        return null;
    }

    public matrix4d subtractMatrix4d (matrix4d _matrix) {
        /*
            [a11][a12][a13][a14]   [b11][b12][b13][b14]   [][][][]
            [a21][a22][a23][a24] - [b21][b22][b23][b24] = [][][][]
            [a31][a32][a33][a34]   [b31][b32][b33][b34]   [][][][]
            [a41][a42][a43][a44]   [b41][b42][b43][b44]   [][][][]
         */

        double a11 = matrix[0][0];
        double a12 = matrix[0][1];
        double a13 = matrix[0][2];
        double a14 = matrix[0][3];
        double a21 = matrix[1][0];
        double a22 = matrix[1][1];
        double a23 = matrix[1][2];
        double a24 = matrix[1][3];
        double a31 = matrix[2][0];
        double a32 = matrix[2][1];
        double a33 = matrix[2][2];
        double a34 = matrix[2][3];
        double a41 = matrix[3][0];
        double a42 = matrix[3][1];
        double a43 = matrix[3][2];
        double a44 = matrix[3][3];

        double b11 = _matrix.get11();
        double b12 = _matrix.get12();
        double b13 = _matrix.get13();
        double b14 = _matrix.get14();
        double b21 = _matrix.get21();
        double b22 = _matrix.get22();
        double b23 = _matrix.get23();
        double b24 = _matrix.get24();
        double b31 = _matrix.get31();
        double b32 = _matrix.get32();
        double b33 = _matrix.get33();
        double b34 = _matrix.get34();
        double b41 = _matrix.get41();
        double b42 = _matrix.get42();
        double b43 = _matrix.get43();
        double b44 = _matrix.get44();

        return null;
    }

    //region GETTERS
    public double[][] getMatrix4d () {
        return matrix;
    }

    public double get11 () {
        return matrix[0][0];
    }

    public double get12 () {
        return matrix[0][1];
    }

    public double get13 () {
        return matrix[0][2];
    }

    public double get14 () {
        return matrix[0][3];
    }

    public double get21 () {
        return matrix[1][0];
    }

    public double get22 () {
        return matrix[1][1];
    }

    public double get23 () {
        return matrix[1][2];
    }

    public double get24 () {
        return matrix[1][3];
    }

    public double get31 () {
        return matrix[2][0];
    }

    public double get32 () {
        return matrix[2][1];
    }

    public double get33 () {
        return matrix[2][2];
    }

    public double get34 () {
        return matrix[2][3];
    }

    public double get41 () {
        return matrix[4][0];
    }

    public double get42 () {
        return matrix[4][1];
    }

    public double get43 () {
        return matrix[4][2];
    }

    public double get44 () {
        return matrix[4][3];
    }
    //endregion
}
