package matrices;

public class matrix4d {
    private double[][] matrix = new double[4][4];

    public matrix4d(double _m00, double _m01, double _m02, double _m03,
                    double _m10, double _m11, double _m12, double _m13,
                    double _m20, double _m21, double _m22, double _m23,
                    double _m30, double _m31, double _m32, double _m33) {
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

    public matrix4d(double _a) {
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

    public matrix4d() {
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

    public matrix4d multiplyMatrix4d (matrix4d _matrix) {
        /*
            [a00][a01][a02][a03]   [b00][b01][b02][b03]   [][][][]
            [a10][a11][a12][a13] * [b10][b11][b12][b13] = [][][][]
            [a20][a21][a22][a23]   [b20][b21][b22][b23]   [][][][]
            [a30][a31][a32][a33]   [b30][b31][b32][b33]   [][][][]
         */

        return null;
    }

    public matrix4d addMatrix4d (matrix4d _matrix) {
        return new matrix4d((this.m00() + _matrix.m00()),
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

    public matrix4d subtractMatrix4d (matrix4d _matrix) {
        return new matrix4d((this.m00() - _matrix.m00()),
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
    public matrix4d getMatrix4d () {
        return this;
    }
    public double[][] getMatrixArray4d () {
        return matrix;
    }

    public double m00 () {
        return matrix[0][0];
    }

    public double m01 () {
        return matrix[0][1];
    }

    public double m02 () {
        return matrix[0][2];
    }

    public double m03 () {
        return matrix[0][3];
    }

    public double m10 () {
        return matrix[1][0];
    }

    public double m11 () {
        return matrix[1][1];
    }

    public double m12 () {
        return matrix[1][2];
    }

    public double m13 () {
        return matrix[1][3];
    }

    public double m20 () {
        return matrix[2][0];
    }

    public double m21 () {
        return matrix[2][1];
    }

    public double m22 () {
        return matrix[2][2];
    }

    public double m23 () {
        return matrix[2][3];
    }

    public double m30 () {
        return matrix[4][0];
    }

    public double m31 () {
        return matrix[4][1];
    }

    public double m32 () {
        return matrix[4][2];
    }

    public double m33 () {
        return matrix[4][3];
    }
    //endregion

    //region SETTERS
    public void setMatrix4d (matrix4d _matrix) {
        this.matrix = _matrix.getMatrixArray4d();
    }
    public void setMatrix4d (double[][] _matrix) {
        this.matrix = _matrix;
    }
    public void m00 (double _m00) {
        matrix[0][0] = _m00;
    }
    public void m01 (double _m01) {
        matrix[0][1]  = _m01;
    }
    public void m02 (double _m02) {
        matrix[0][2] = _m02;
    }
    public void m03 (double _m03) {
        matrix[0][3] = _m03;
    }
    public void m10 (double _m10) {
        matrix[1][0] = _m10;
    }
    public void m11 (double _m11) {
        matrix[1][1] = _m11;
    }
    public void m12 (double _m12) {
        matrix[1][2] = _m12;
    }
    public void m13 (double _m13) {
        matrix[1][3] = _m13;
    }
    public void m20 (double _m20) {
        matrix[2][0] = _m20;
    }
    public void m21 (double _m21) {
        matrix[2][1] = _m21;
    }
    public void m22 (double _m22) {
        matrix[2][2] = _m22;
    }
    public void m23 (double _m23) {
        matrix[2][3]  = _m23;
    }
    public void m30 (double _m30) {
        matrix[4][0] = _m30;
    }
    public void m31 (double _m31) {
        matrix[4][1] = _m31;
    }
    public void m32 (double _m32) {
        matrix[4][2] = _m32;
    }
    public void m33 (double _m33) {
        matrix[4][3] = _m33;
    }
    //endregion
}