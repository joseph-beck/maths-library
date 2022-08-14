package matrices;

public class matrix3f {
    private float[][] matrix = new float[3][3];

    public matrix3f(float _m00, float _m01, float _m02,
                    float _m10, float _m11, float _m12,
                    float _m20, float _m21, float _m22) {
        matrix[0][0] = _m00;
        matrix[0][1] = _m01;
        matrix[0][2] = _m02;
        matrix[1][0] = _m10;
        matrix[1][1] = _m11;
        matrix[1][2] = _m12;
        matrix[2][0] = _m20;
        matrix[2][1] = _m21;
        matrix[2][2] = _m22;
    }

    public matrix3f multiplyMatrix3f (matrix3f _matrix) {
        return new matrix3f((this.m00() * _matrix.m00()) + (this.m01() * _matrix.m10()) + (this.m02() * _matrix.m20()),
                            (this.m00() * _matrix.m01()) + (this.m01() * _matrix.m11()) + (this.m02() * _matrix.m21()),
                            (this.m00() * _matrix.m02()) + (this.m01() * _matrix.m12()) + (this.m02() * _matrix.m22()),
                            (this.m10() * _matrix.m00()) + (this.m11() * _matrix.m10()) + (this.m12() * _matrix.m20()),
                            (this.m10() * _matrix.m01()) + (this.m11() * _matrix.m11()) + (this.m12() * _matrix.m21()),
                            (this.m10() * _matrix.m02()) + (this.m11() * _matrix.m12()) + (this.m12() * _matrix.m22()),
                            (this.m20() * _matrix.m00()) + (this.m21() * _matrix.m10()) + (this.m22() * _matrix.m20()),
                            (this.m20() * _matrix.m01()) + (this.m21() * _matrix.m11()) + (this.m22() * _matrix.m21()),
                            (this.m20() * _matrix.m02()) + (this.m21() * _matrix.m12()) + (this.m22() * _matrix.m22()));
    }

    public matrix3f addMatrix3f (matrix3f _matrix) {
        return new matrix3f((this.m00() + _matrix.m00()),
                            (this.m01() + _matrix.m01()),
                            (this.m02() + _matrix.m02()),
                            (this.m10() + _matrix.m10()),
                            (this.m11() + _matrix.m11()),
                            (this.m12() + _matrix.m12()),
                            (this.m20() + _matrix.m20()),
                            (this.m21() + _matrix.m21()),
                            (this.m22() + _matrix.m22()));
    }

    public matrix3f subtractMatrix3f (matrix3f _matrix) {
        return new matrix3f((this.m00() - _matrix.m00()),
                            (this.m01() - _matrix.m01()),
                            (this.m02() - _matrix.m02()),
                            (this.m10() - _matrix.m10()),
                            (this.m11() - _matrix.m11()),
                            (this.m12() - _matrix.m12()),
                            (this.m20() - _matrix.m20()),
                            (this.m21() - _matrix.m21()),
                            (this.m22() - _matrix.m22()));
    }

    //region GETTERS
    public matrix3f getMatrix3f () {
        return this;
    }
    public float[][] getMatrixArray3f () {
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
    public float m10 () {
        return matrix[1][0];
    }
    public float m11 () {
        return matrix[1][1];
    }
    public float m12 () {
        return matrix[1][2];
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
    //endregion

    //region SETTERS
    public void setMatrix3f (matrix3f _matrix) {
        this.matrix = _matrix.getMatrixArray3f();
    }
    public void setMatrix3f (float[][] _matrix) {
        this.matrix = _matrix;
    }
    public void m00 (float _m00) {
        this.matrix[0][0] = _m00;
    }
    public void m01 (float _m01) {
        this.matrix[0][1] = _m01;
    }
    public void m02 (float _m02) {
        this.matrix[0][2] = _m02;
    }
    public void m10 (float _m10) {
        this.matrix[1][0] = _m10;
    }
    public void m11 (float _m11) {
        this.matrix[1][1] = _m11;
    }
    public void m12 (float _m12) {
        this.matrix[1][2] = _m12;
    }
    public void m20 (float _m20) {
        this.matrix[2][0] = _m20;
    }
    public void m21 (float _m21) {
        this.matrix[2][1] = _m21;
    }
    public void m22 (float _m22) {
        this.matrix[2][2] = _m22;
    }
    //endregion
}
