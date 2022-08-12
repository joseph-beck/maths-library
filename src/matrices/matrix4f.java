package matrices;

public class matrix4f {
    private float[][] matrix = new float[4][4];

    public matrix4f(float a11, float a12, float a13, float a14,
                    float a21, float a22, float a23, float a24,
                    float a31, float a32, float a33, float a34,
                    float a41, float a42, float a43, float a44) {
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

    public matrix4f(float a) {
        for (int i = 0; i < 4; i++) {
            for (int j= 0; j < 4; j++) {
                matrix[i][j] = a;
            }
        }
    }

    public matrix4f multiplyMatrix4f (matrix4f _matrix) {
        /*
            [a11][a12][a13][a14]   [b11][b12][b13][b14]   [][][][]
            [a21][a22][a23][a24] * [b21][b22][b23][b24] = [][][][]
            [a31][a32][a33][a34]   [b31][b32][b33][b34]   [][][][]
            [a41][a42][a43][a44]   [b41][b42][b43][b44]   [][][][]
         */

        float a11 = matrix[0][0];
        float a12 = matrix[0][1];
        float a13 = matrix[0][2];
        float a14 = matrix[0][3];
        float a21 = matrix[1][0];
        float a22 = matrix[1][1];
        float a23 = matrix[1][2];
        float a24 = matrix[1][3];
        float a31 = matrix[2][0];
        float a32 = matrix[2][1];
        float a33 = matrix[2][2];
        float a34 = matrix[2][3];
        float a41 = matrix[3][0];
        float a42 = matrix[3][1];
        float a43 = matrix[3][2];
        float a44 = matrix[3][3];

        float b11 = _matrix.get11();
        float b12 = _matrix.get12();
        float b13 = _matrix.get13();
        float b14 = _matrix.get14();
        float b21 = _matrix.get21();
        float b22 = _matrix.get22();
        float b23 = _matrix.get23();
        float b24 = _matrix.get24();
        float b31 = _matrix.get31();
        float b32 = _matrix.get32();
        float b33 = _matrix.get33();
        float b34 = _matrix.get34();
        float b41 = _matrix.get41();
        float b42 = _matrix.get42();
        float b43 = _matrix.get43();
        float b44 = _matrix.get44();

        return null;
    }

    public matrix4f addMatrix4f (matrix4f _matrix) {
        /*
            [a11][a12][a13][a14]   [b11][b12][b13][b14]   [][][][]
            [a21][a22][a23][a24] + [b21][b22][b23][b24] = [][][][]
            [a31][a32][a33][a34]   [b31][b32][b33][b34]   [][][][]
            [a41][a42][a43][a44]   [b41][b42][b43][b44]   [][][][]
         */

        float a11 = matrix[0][0];
        float a12 = matrix[0][1];
        float a13 = matrix[0][2];
        float a14 = matrix[0][3];
        float a21 = matrix[1][0];
        float a22 = matrix[1][1];
        float a23 = matrix[1][2];
        float a24 = matrix[1][3];
        float a31 = matrix[2][0];
        float a32 = matrix[2][1];
        float a33 = matrix[2][2];
        float a34 = matrix[2][3];
        float a41 = matrix[3][0];
        float a42 = matrix[3][1];
        float a43 = matrix[3][2];
        float a44 = matrix[3][3];

        float b11 = _matrix.get11();
        float b12 = _matrix.get12();
        float b13 = _matrix.get13();
        float b14 = _matrix.get14();
        float b21 = _matrix.get21();
        float b22 = _matrix.get22();
        float b23 = _matrix.get23();
        float b24 = _matrix.get24();
        float b31 = _matrix.get31();
        float b32 = _matrix.get32();
        float b33 = _matrix.get33();
        float b34 = _matrix.get34();
        float b41 = _matrix.get41();
        float b42 = _matrix.get42();
        float b43 = _matrix.get43();
        float b44 = _matrix.get44();

        return null;
    }

    public matrix4f subtractMatrix4d (matrix4f _matrix) {
        /*
            [a11][a12][a13][a14]   [b11][b12][b13][b14]   [][][][]
            [a21][a22][a23][a24] - [b21][b22][b23][b24] = [][][][]
            [a31][a32][a33][a34]   [b31][b32][b33][b34]   [][][][]
            [a41][a42][a43][a44]   [b41][b42][b43][b44]   [][][][]
         */

        float[][] matrix1 = this.getMatrixArray4f();
        float[][] matrix2 = _matrix.getMatrixArray4f();

        return null;
    }

    //region GETTERS
    public matrix4f getMatrix4f () {
        return this;
    }
    public float[][] getMatrixArray4f () {
        return matrix;
    }

    public float get11 () {
        return matrix[0][0];
    }

    public float get12 () {
        return matrix[0][1];
    }

    public float get13 () {
        return matrix[0][2];
    }

    public float get14 () {
        return matrix[0][3];
    }

    public float get21 () {
        return matrix[1][0];
    }

    public float get22 () {
        return matrix[1][1];
    }

    public float get23 () {
        return matrix[1][2];
    }

    public float get24 () {
        return matrix[1][3];
    }

    public float get31 () {
        return matrix[2][0];
    }

    public float get32 () {
        return matrix[2][1];
    }

    public float get33 () {
        return matrix[2][2];
    }

    public float get34 () {
        return matrix[2][3];
    }

    public float get41 () {
        return matrix[4][0];
    }

    public float get42 () {
        return matrix[4][1];
    }

    public float get43 () {
        return matrix[4][2];
    }

    public float get44 () {
        return matrix[4][3];
    }
    //endregion
}
