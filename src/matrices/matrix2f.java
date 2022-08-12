package matrices;

public class matrix2f {
    private float[][] matrix = new float[2][2];



    public matrix2f (float a11, float a12,
                     float a21, float a22) {
        matrix[0][0] = a11;
        matrix[0][1] = a12;
        matrix[1][0] = a21;
        matrix[1][1] = a22;
    }

    public matrix2f multiplyMatrix2f (matrix2f _matrix) {
        /*
            [a11][a12] * [b11][b12] = [a11 * b11 + a12 * b21][a11 * b12 + a12 * b22]
            [a21][a22]   [b21][b22]   [a21 * b11 + a22 * b21][a21 * b12 + a22 * b22]
         */

        float a11 = matrix[0][0];
        float a12 = matrix[0][1];
        float a21 = matrix[1][0];
        float a22 = matrix[1][1];

        float b11 = _matrix.get11();
        float b12 = _matrix.get12();
        float b21 = _matrix.get21();
        float b22 = _matrix.get22();

        return new matrix2f(    ((a11 * b11) + (a12 * b21)),
                ((a11 * b12) + (a12 * b22)),
                ((a21 * b11) + (a22 * b21)),
                ((a21 * b12) + (a22 * b22)));
    }

    public matrix2f addMatrix2f (matrix2f _matrix) {
        /*
            [a11][a12] + [b11][b12] = [a11 + b11][a12 + b12]
            [a21][a22]   [b21][b22]   [a21 + b21][a22 + b22]
         */

        float a11 = matrix[0][0];
        float a12 = matrix[0][1];
        float a21 = matrix[1][0];
        float a22 = matrix[1][1];

        float b11 = _matrix.get11();
        float b12 = _matrix.get12();
        float b21 = _matrix.get21();
        float b22 = _matrix.get22();

        return new matrix2f(    (a11 + b11),
                                (a12 + b12),
                                (a21 + b21),
                                (a22 + b22));
    }

    public matrix2f substractMatrix2f (matrix2f _matrix) {
        /*
            [a11][a12] + [b11][b12] = [a11 - b11][a12 - b12]
            [a21][a22]   [b21][b22]   [a21 - b21][a22 - b22]
         */

        float a11 = matrix[0][0];
        float a12 = matrix[0][1];
        float a21 = matrix[1][0];
        float a22 = matrix[1][1];

        float b11 = _matrix.get11();
        float b12 = _matrix.get12();
        float b21 = _matrix.get21();
        float b22 = _matrix.get22();

        return new matrix2f(    (a11 - b11),
                                (a12 - b12),
                                (a21 - b21),
                                (a22 - b22));
    }

    //region GETTERS
    public float[][] getMatrixArray2f () { return matrix; }
    public matrix2f getMatrix2f () { return this; }
    public float get11() {
        return matrix[0][0];
    }

    public float get12() {
        return matrix[0][1];
    }

    public float get21() {
        return matrix[1][0];
    }

    public float get22() {
        return matrix[1][1];
    }

    //endregion
}
