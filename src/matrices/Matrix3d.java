package matrices;

public class Matrix3d {
    private double[][] matrix = new double[3][3];

    public Matrix3d(double _m00, double _m01, double _m02,
                    double _m10, double _m11, double _m12,
                    double _m20, double _m21, double _m22) {
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

    public Matrix3d(double _a) {
        matrix[0][0] = _a;
        matrix[0][1] = _a;
        matrix[0][2] = _a;
        matrix[1][0] = _a;
        matrix[1][1] = _a;
        matrix[1][2] = _a;
        matrix[2][0] = _a;
        matrix[2][1] = _a;
        matrix[2][2] = _a;
    }

    public Matrix3d() {
        matrix[0][0] = 0;
        matrix[0][1] = 0;
        matrix[0][2] = 0;
        matrix[1][0] = 0;
        matrix[1][1] = 0;
        matrix[1][2] = 0;
        matrix[2][0] = 0;
        matrix[2][1] = 0;
        matrix[2][2] = 0;
    }

    public Matrix3d multiplyMatrix3d (Matrix3d _matrix) {
        return new Matrix3d((this.m00() * _matrix.m00()) + (this.m01() * _matrix.m10()) + (this.m02() * _matrix.m20()),
                            (this.m00() * _matrix.m01()) + (this.m01() * _matrix.m11()) + (this.m02() * _matrix.m21()),
                            (this.m00() * _matrix.m02()) + (this.m01() * _matrix.m12()) + (this.m02() * _matrix.m22()),
                            (this.m10() * _matrix.m00()) + (this.m11() * _matrix.m10()) + (this.m12() * _matrix.m20()),
                            (this.m10() * _matrix.m01()) + (this.m11() * _matrix.m11()) + (this.m12() * _matrix.m21()),
                            (this.m10() * _matrix.m02()) + (this.m11() * _matrix.m12()) + (this.m12() * _matrix.m22()),
                            (this.m20() * _matrix.m00()) + (this.m21() * _matrix.m10()) + (this.m22() * _matrix.m20()),
                            (this.m20() * _matrix.m01()) + (this.m21() * _matrix.m11()) + (this.m22() * _matrix.m21()),
                            (this.m20() * _matrix.m02()) + (this.m21() * _matrix.m12()) + (this.m22() * _matrix.m22()));
    }

    public Matrix3d addMatrix3d (Matrix3d _matrix) {
        return new Matrix3d((this.m00() + _matrix.m00()),
                            (this.m01() + _matrix.m01()),
                            (this.m02() + _matrix.m02()),
                            (this.m10() + _matrix.m10()),
                            (this.m11() + _matrix.m11()),
                            (this.m12() + _matrix.m12()),
                            (this.m20() + _matrix.m20()),
                            (this.m21() + _matrix.m21()),
                            (this.m22() + _matrix.m22()));
    }

    public Matrix3d subtractMatrix3d (Matrix3d _matrix) {
        return new Matrix3d((this.m00() - _matrix.m00()),
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
    public Matrix3d getMatrix3d () {
        return this;
    }
    public double[][] getMatrixArray3d () {
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
    public double m10 () {
        return matrix[1][0];
    }
    public double m11 () {
        return matrix[1][1];
    }
    public double m12 () {
        return matrix[1][2];
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
    //endregion

    //region SETTERS
    public void setMatrix3d (Matrix3d _matrix) {
        this.matrix = _matrix.getMatrixArray3d();
    }
    public void setMatrix3d (double[][] _matrix) {
        this.matrix = _matrix;
    }
    public void m00 (double _m00) {
        this.matrix[0][0] = _m00;
    }
    public void m01 (double _m01) {
        this.matrix[0][1] = _m01;
    }
    public void m02 (double _m02) {
        this.matrix[0][2] = _m02;
    }
    public void m10 (double _m10) {
        this.matrix[1][0] = _m10;
    }
    public void m11 (double _m11) {
        this.matrix[1][1] = _m11;
    }
    public void m12 (double _m12) {
        this.matrix[1][2] = _m12;
    }
    public void m20 (double _m20) {
        this.matrix[2][0] = _m20;
    }
    public void m21 (double _m21) {
        this.matrix[2][1] = _m21;
    }
    public void m22 (double _m22) {
        this.matrix[2][2] = _m22;
    }
    //endregion
}
