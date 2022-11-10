package matrices;

public class aMatrix3i {
    private int[][] matrix = new int[3][3];

    public aMatrix3i(int _m00, int _m01, int _m02,
                     int _m10, int _m11, int _m12,
                     int _m20, int _m21, int _m22) {
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

    public aMatrix3i multiplyMatrix3i (aMatrix3i _matrix) {
        return new aMatrix3i((this.m00() * _matrix.m00()) + (this.m01() * _matrix.m10()) + (this.m02() * _matrix.m20()),
                            (this.m00() * _matrix.m01()) + (this.m01() * _matrix.m11()) + (this.m02() * _matrix.m21()),
                            (this.m00() * _matrix.m02()) + (this.m01() * _matrix.m12()) + (this.m02() * _matrix.m22()),
                            (this.m10() * _matrix.m00()) + (this.m11() * _matrix.m10()) + (this.m12() * _matrix.m20()),
                            (this.m10() * _matrix.m01()) + (this.m11() * _matrix.m11()) + (this.m12() * _matrix.m21()),
                            (this.m10() * _matrix.m02()) + (this.m11() * _matrix.m12()) + (this.m12() * _matrix.m22()),
                            (this.m20() * _matrix.m00()) + (this.m21() * _matrix.m10()) + (this.m22() * _matrix.m20()),
                            (this.m20() * _matrix.m01()) + (this.m21() * _matrix.m11()) + (this.m22() * _matrix.m21()),
                            (this.m20() * _matrix.m02()) + (this.m21() * _matrix.m12()) + (this.m22() * _matrix.m22()));
    }

    public aMatrix3i addMatrix3i (aMatrix3i _matrix) {
        return new aMatrix3i((this.m00() + _matrix.m00()),
                            (this.m01() + _matrix.m01()),
                            (this.m02() + _matrix.m02()),
                            (this.m10() + _matrix.m10()),
                            (this.m11() + _matrix.m11()),
                            (this.m12() + _matrix.m12()),
                            (this.m20() + _matrix.m20()),
                            (this.m21() + _matrix.m21()),
                            (this.m22() + _matrix.m22()));
    }

    public aMatrix3i subtractMatrix3i (aMatrix3i _matrix) {
        return new aMatrix3i((this.m00() - _matrix.m00()),
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
    public aMatrix3i getMatrix3i () {
        return this;
    }
    public int[][] getMatrixArray3i () {
        return matrix;
    }
    public int m00 () {
        return matrix[0][0];
    }
    public int m01 () {
        return matrix[0][1];
    }
    public int m02 () {
        return matrix[0][2];
    }
    public int m10 () {
        return matrix[1][0];
    }
    public int m11 () {
        return matrix[1][1];
    }
    public int m12 () {
        return matrix[1][2];
    }
    public int m20 () {
        return matrix[2][0];
    }
    public int m21 () {
        return matrix[2][1];
    }
    public int m22 () {
        return matrix[2][2];
    }
    //endregion

    //region SETTERS
    public void setMatrix3i (aMatrix3i _matrix) {
        this.matrix = _matrix.getMatrixArray3i();
    }
    public void setMatrix3i (int[][] _matrix) {
        this.matrix = _matrix;
    }
    public void m00 (int _m00) {
        this.matrix[0][0] = _m00;
    }
    public void m01 (int _m01) {
        this.matrix[0][1] = _m01;
    }
    public void m02 (int _m02) {
        this.matrix[0][2] = _m02;
    }
    public void m10 (int _m10) {
        this.matrix[1][0] = _m10;
    }
    public void m11 (int _m11) {
        this.matrix[1][1] = _m11;
    }
    public void m12 (int _m12) {
        this.matrix[1][2] = _m12;
    }
    public void m20 (int _m20) {
        this.matrix[2][0] = _m20;
    }
    public void m21 (int _m21) {
        this.matrix[2][1] = _m21;
    }
    public void m22 (int _m22) {
        this.matrix[2][2] = _m22;
    }
    //endregion
}
