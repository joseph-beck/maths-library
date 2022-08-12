package matrices;

public class matrix3f {
    private float[][] matrix = new float[3][3];

    public matrix3f (float a11, float a12, float a13,
                     float a21, float a22, float a23,
                     float a31, float a32, float a33) {
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

    public matrix3f multiplyMatrix3f (matrix3f _matrix) {
        /*
            [a11][a12][a13]   [b11][b12][b13]   [a11 * b11 + a12 * b21 + a13 * b31][a11 * b12 + a12 * b22 + a13 * b32][a11 * b13 + a12 * b23 + a13 * b33]
            [a21][a22][a23] * [b21][b22][b23] = [a21 * b11 + a22 * b21 + a23 * b31][a21 * b12 + a22 * b22 + a23 * b32][a21 * b13 + a22 * b23 + a23 * b33]
            [a31][a32][a33]   [b31][b32][b33]   [a31 * b11 + a32 * b21 + a33 * b31][a31 * b12 + a32 * b22 + a33 * b32][a31 * b13 + a32 * b23 + a33 * b33]
         */

        float a11 =  matrix[0][0];
        float a12 =  matrix[0][1];
        float a13 =  matrix[0][2];
        float a21 =  matrix[1][0];
        float a22 =  matrix[1][1];
        float a23 =  matrix[1][2];
        float a31 =  matrix[2][0];
        float a32 =  matrix[2][1];
        float a33 =  matrix[2][2];

        float b11 = _matrix.getMatrix11();
        float b12 = _matrix.getMatrix12();
        float b13 = _matrix.getMatrix13();
        float b21 = _matrix.getMatrix21();
        float b22 = _matrix.getMatrix22();
        float b23 = _matrix.getMatrix23();
        float b31 = _matrix.getMatrix31();
        float b32 = _matrix.getMatrix32();
        float b33 = _matrix.getMatrix33();

        return new matrix3f((a11 * b11) + (a12 * b21) + (a13 * b31),
                (a11 * b12) + (a12 * b22) + (a13 * b32),
                (a11 * b13) + (a12 * b23) + (a13 * b33),
                (a21 * b11) + (a22 * b21) + (a23 * b31),
                (a21 * b12) + (a22 * b22) + (a23 * b32),
                (a21 * b13) + (a22 * b23) + (a23 * b33),
                (a31 * b11) + (a32 * b21) + (a33 * b31),
                (a31 * b12) + (a32 * b22) + (a33 * b32),
                (a31 * b13) + (a32 * b23) + (a33 * b33));
    }

    public matrix3f addMatrix3f (matrix3f _matrix) {
        /*
            [a11][a12][a13]   [b11][b12][b13]   [a11 + b11][a12 + b12][a13 + b13]
            [a21][a22][a23] + [b21][b22][b23] = [a21 + b21][a22 + b22][a23 + b23]
            [a31][a32][a33]   [b31][b32][b33]   [a31 + b31][a32 + b32][a33 + b33]
         */

        float a11 =  matrix[0][0];
        float a12 =  matrix[0][1];
        float a13 =  matrix[0][2];
        float a21 =  matrix[1][0];
        float a22 =  matrix[1][1];
        float a23 =  matrix[1][2];
        float a31 =  matrix[2][0];
        float a32 =  matrix[2][1];
        float a33 =  matrix[2][2];

        float b11 = _matrix.getMatrix11();
        float b12 = _matrix.getMatrix12();
        float b13 = _matrix.getMatrix13();
        float b21 = _matrix.getMatrix21();
        float b22 = _matrix.getMatrix22();
        float b23 = _matrix.getMatrix23();
        float b31 = _matrix.getMatrix31();
        float b32 = _matrix.getMatrix32();
        float b33 = _matrix.getMatrix33();

        return new matrix3f((a11 + b11),
                            (a12 + b12),
                            (a13 + b13),
                            (a21 + b21),
                            (a22 + b22),
                            (a23 + b23),
                            (a31 + b31),
                            (a32 + b32),
                            (a33 + b33));
    }

    public matrix3f subtractMatrix3f (matrix3f _matrix) {
        /*
            [a11][a12][a13]   [b11][b12][b13]   [a11 - b11][a12 - b12][a13 - b13]
            [a21][a22][a23] - [b21][b22][b23] = [a21 - b21][a22 - b22][a23 - b23]
            [a31][a32][a33]   [b31][b32][b33]   [a31 - b31][a32 - b32][a33 - b33]
         */

        float a11 =  matrix[0][0];
        float a12 =  matrix[0][1];
        float a13 =  matrix[0][2];
        float a21 =  matrix[1][0];
        float a22 =  matrix[1][1];
        float a23 =  matrix[1][2];
        float a31 =  matrix[2][0];
        float a32 =  matrix[2][1];
        float a33 =  matrix[2][2];

        float b11 = _matrix.getMatrix11();
        float b12 = _matrix.getMatrix12();
        float b13 = _matrix.getMatrix13();
        float b21 = _matrix.getMatrix21();
        float b22 = _matrix.getMatrix22();
        float b23 = _matrix.getMatrix23();
        float b31 = _matrix.getMatrix31();
        float b32 = _matrix.getMatrix32();
        float b33 = _matrix.getMatrix33();

        return new matrix3f((a11 - b11),
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
    public matrix3f getMatrix3f () {
        return this;
    }
    public float[][] getMatrixArray3f () {
        return matrix;
    }
    public float getMatrix11 () {
        return matrix[0][0];
    }

    public float getMatrix12 () {
        return matrix[0][1];
    }

    public float getMatrix13 () {
        return matrix[0][2];
    }

    public float getMatrix21 () {
        return matrix[1][0];
    }

    public float getMatrix22 () {
        return matrix[1][1];
    }

    public float getMatrix23 () {
        return matrix[1][2];
    }

    public float getMatrix31 () {
        return matrix[2][0];
    }

    public float getMatrix32 () {
        return matrix[2][1];
    }

    public float getMatrix33 () {
        return matrix[2][2];
    }
    //endregion
}
