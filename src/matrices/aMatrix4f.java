package matrices;

public class aMatrix4f {
    private float[][] matrix = new float[4][4];

    public aMatrix4f(float _m00, float _m01, float _m02, float _m03,
                     float _m10, float _m11, float _m12, float _m13,
                     float _m20, float _m21, float _m22, float _m23,
                     float _m30, float _m31, float _m32, float _m33) {
        matrix[0][0] = _m00;
        matrix[0][1] = _m01;
        matrix[0][2] = _m02;
        matrix[0][3] = _m03;
        matrix[1][0] = _m10;
        matrix[1][1] = _m11;
        matrix[1][2] = _m12;
        matrix[1][3] = _m13;
        matrix[2][0] = _m20;
        matrix[2][1] = _m21;
        matrix[2][2] = _m22;
        matrix[2][3] = _m23;
        matrix[3][0] = _m30;
        matrix[3][1] = _m31;
        matrix[3][2] = _m32;
        matrix[3][3] = _m33;
    }

    public aMatrix4f(float _a) {
        matrix[0][0] = _a;
        matrix[0][1] = _a;
        matrix[0][2] = _a;
        matrix[0][3] = _a;
        matrix[1][0] = _a;
        matrix[1][1] = _a;
        matrix[1][2] = _a;
        matrix[1][3] = _a;
        matrix[2][0] = _a;
        matrix[2][1] = _a;
        matrix[2][2] = _a;
        matrix[2][3] = _a;
        matrix[3][0] = _a;
        matrix[3][1] = _a;
        matrix[3][2] = _a;
        matrix[3][3] = _a;
    }

    public aMatrix4f() {
        matrix[0][0] = 0;
        matrix[0][1] = 0;
        matrix[0][2] = 0;
        matrix[0][3] = 0;
        matrix[1][0] = 0;
        matrix[1][1] = 0;
        matrix[1][2] = 0;
        matrix[1][3] = 0;
        matrix[2][0] = 0;
        matrix[2][1] = 0;
        matrix[2][2] = 0;
        matrix[2][3] = 0;
        matrix[3][0] = 0;
        matrix[3][1] = 0;
        matrix[3][2] = 0;
        matrix[3][3] = 0;
    }

    public aMatrix4f multiplyMatrix4f (aMatrix4f _matrix) {
        /*
            [a00][a01][a02][a03]   [b00][b01][b02][b03]   [a00 * b00 + a01 * b10 + a02 * b20 + a03 * b30][a00 * b01 + a01 * b11 + a02 * b21 + a03 * b31][a00 * b02 + a01 * b12 + a02 * b22 + a03 * b32][a00 * b03 + a01 * b13 + a02 * b23 + a03 * b33]
            [a10][a11][a12][a13] * [b10][b11][b12][b13] = [a10 * b00 + a11 * b10 + a12 * b20 + a13 * b30][a10 * b01 + a11 * b11 + a12 * b21 + a13 * b31][a10 * b02 + a11 * b12 + a12 * b22 + a13 * b32][a10 * b03 + a11 * b13 + a12 * b23 + a13 * b33]
            [a20][a21][a22][a23]   [b20][b21][b22][b23]   [a20 * b00 + a21 * b10 + a22 * b20 + a23 * b30][a20 * b01 + a21 * b11 + a22 * b21 + a23 * b31][a20 * b02 + a21 * b12 + a22 * b22 + a23 * b32][a20 * b03 + a21 * b13 + a22 * b23 + a23 * b33]
            [a30][a31][a32][a33]   [b30][b31][b32][b33]   [a30 * b00 + a31 * b10 + a32 * b20 + a33 * b30][a30 * b01 + a31 * b11 + a32 * b21 + a33 * b31][a30 * b02 + a31 * b12 + a32 * b22 + a33 * b32][a30 * b03 + a31 * b13 + a32 * b23 + a33 * b33]
         */

        return new aMatrix4f((this.m00() * _matrix.m00()) + (this.m01() * _matrix.m10()) + (this.m02() * _matrix.m20()) + (this.m03() * _matrix.m30()),
                            (this.m00() * _matrix.m01()) + (this.m01() * _matrix.m11()) + (this.m02() * _matrix.m21()) + (this.m03() * _matrix.m31()),
                            (this.m00() * _matrix.m02()) + (this.m01() * _matrix.m12()) + (this.m02() * _matrix.m22()) + (this.m03() * _matrix.m32()),
                            (this.m00() * _matrix.m03()) + (this.m01() * _matrix.m13()) + (this.m02() * _matrix.m23()) + (this.m03() * _matrix.m33()),
                            (this.m10() * _matrix.m00()) + (this.m11() * _matrix.m10()) + (this.m12() * _matrix.m20()) + (this.m13() * _matrix.m30()),
                            (this.m10() * _matrix.m01()) + (this.m11() * _matrix.m11()) + (this.m12() * _matrix.m21()) + (this.m13() * _matrix.m31()),
                            (this.m10() * _matrix.m02()) + (this.m11() * _matrix.m12()) + (this.m12() * _matrix.m22()) + (this.m13() * _matrix.m32()),
                            (this.m10() * _matrix.m03()) + (this.m11() * _matrix.m13()) + (this.m12() * _matrix.m23()) + (this.m13() * _matrix.m33()),
                            (this.m20() * _matrix.m00()) + (this.m21() * _matrix.m10()) + (this.m22() * _matrix.m20()) + (this.m23() * _matrix.m30()),
                            (this.m20() * _matrix.m01()) + (this.m21() * _matrix.m11()) + (this.m22() * _matrix.m21()) + (this.m23() * _matrix.m31()),
                            (this.m20() * _matrix.m02()) + (this.m21() * _matrix.m12()) + (this.m22() * _matrix.m22()) + (this.m23() * _matrix.m32()),
                            (this.m20() * _matrix.m03()) + (this.m21() * _matrix.m13()) + (this.m22() * _matrix.m23()) + (this.m23() * _matrix.m33()),
                            (this.m30() * _matrix.m00()) + (this.m31() * _matrix.m10()) + (this.m32() * _matrix.m20()) + (this.m33() * _matrix.m30()),
                            (this.m30() * _matrix.m01()) + (this.m31() * _matrix.m11()) + (this.m32() * _matrix.m21()) + (this.m33() * _matrix.m31()),
                            (this.m30() * _matrix.m02()) + (this.m31() * _matrix.m12()) + (this.m32() * _matrix.m22()) + (this.m33() * _matrix.m32()),
                            (this.m30() * _matrix.m03()) + (this.m31() * _matrix.m13()) + (this.m32() * _matrix.m23()) + (this.m33() * _matrix.m33()));
    }

    public aMatrix4f addMatrix4f (aMatrix4f _matrix) {
        return new aMatrix4f((this.m00() + _matrix.m00()),
                            (this.m01() + _matrix.m01()),
                            (this.m02() + _matrix.m02()),
                            (this.m03() + _matrix.m03()),
                            (this.m10() + _matrix.m10()),
                            (this.m11() + _matrix.m11()),
                            (this.m12() + _matrix.m12()),
                            (this.m13() + _matrix.m13()),
                            (this.m20() + _matrix.m20()),
                            (this.m21() + _matrix.m21()),
                            (this.m22() + _matrix.m22()),
                            (this.m23() + _matrix.m23()),
                            (this.m30() + _matrix.m30()),
                            (this.m31() + _matrix.m31()),
                            (this.m32() + _matrix.m32()),
                            (this.m33() + _matrix.m33()));
    }

    public aMatrix4f subtractMatrix4f (aMatrix4f _matrix) {
        return new aMatrix4f((this.m00() - _matrix.m00()),
                            (this.m01() - _matrix.m01()),
                            (this.m02() - _matrix.m02()),
                            (this.m03() - _matrix.m03()),
                            (this.m10() - _matrix.m10()),
                            (this.m11() - _matrix.m11()),
                            (this.m12() - _matrix.m12()),
                            (this.m13() - _matrix.m13()),
                            (this.m20() - _matrix.m20()),
                            (this.m21() - _matrix.m21()),
                            (this.m22() - _matrix.m22()),
                            (this.m23() - _matrix.m23()),
                            (this.m30() - _matrix.m30()),
                            (this.m31() - _matrix.m31()),
                            (this.m32() - _matrix.m32()),
                            (this.m33() - _matrix.m33()));
    }

    //region GETTERS
    public aMatrix4f getMatrix4f () {
        return this;
    }
    public float[][] getMatrixArray4f () {
        return matrix;
    }
    public float m00 () {
        return matrix[0][0];
    }
    public float m01 () {
        return matrix[0][1];
    }
    public float m02 () {
        return matrix[0][2];
    }
    public float m03 () {
        return matrix[0][3];
    }
    public float m10 () {
        return matrix[1][0];
    }
    public float m11 () {
        return matrix[1][1];
    }
    public float m12 () {
        return matrix[1][2];
    }
    public float m13 () {
        return matrix[1][3];
    }
    public float m20 () {
        return matrix[2][0];
    }
    public float m21 () {
        return matrix[2][1];
    }
    public float m22 () {
        return matrix[2][2];
    }
    public float m23 () {
        return matrix[2][3];
    }
    public float m30 () {
        return matrix[3][0];
    }
    public float m31 () {
        return matrix[3][1];
    }
    public float m32 () {
        return matrix[3][2];
    }
    public float m33 () {
        return matrix[3][3];
    }
    //endregion

    //region SETTERS
    public void setMatrix4f (aMatrix4f _matrix) {
        this.matrix = _matrix.getMatrixArray4f();
    }
    public void setMatrix4f (float[][] _matrix) {
        this.matrix = _matrix;
    }
    public void m00 (float _m00) {
        matrix[0][0] = _m00;
    }
    public void m01 (float _m01) {
        matrix[0][1] = _m01;
    }
    public void m02 (float _m02) {
        matrix[0][2] = _m02;
    }
    public void m03 (float _m03) {
        matrix[0][3] = _m03;
    }
    public void m10 (float _m10) {
        matrix[1][0] = _m10;
    }
    public void m11 (float _m11) {
        matrix[1][1] = _m11;
    }
    public void m12 (float _m12) {
        matrix[1][2] = _m12;
    }
    public void m13 (float _m13) {
        matrix[1][3] = _m13;
    }
    public void m20 (float _m20) {
        matrix[2][0] = _m20;
    }
    public void m21 (float _m21) {
        matrix[2][1] = _m21;
    }
    public void m22 (float _m22) {
        matrix[2][2] = _m22;
    }
    public void m23 (float _m23) {
        matrix[2][3] = _m23;
    }
    public void m30 (float _m30) {
        matrix[3][0] = _m30;
    }
    public void m31 (float _m31) {
        matrix[3][1] = _m31;
    }
    public void m32 (float _m32) {
        matrix[3][2] = _m32;
    }
    public void m33 (float _m33) {
        matrix[3][3] = _m33;
    }
    //endregion
}