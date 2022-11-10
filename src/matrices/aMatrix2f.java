package matrices;

public class aMatrix2f {
    private float[][] matrix = new float[2][2];

    public aMatrix2f(float _m00, float _m01,
                     float _m10, float _m11) {
        matrix[0][0] = _m00;
        matrix[0][1] = _m01;
        matrix[1][0] = _m10;
        matrix[1][1] = _m11;
    }

    public aMatrix2f(float _a) {
        matrix[0][0] = _a;
        matrix[0][1] = _a;
        matrix[1][0] = _a;
        matrix[1][1] = _a;
    }

    public aMatrix2f() {
        matrix[0][0] = 0;
        matrix[0][1] = 0;
        matrix[1][0] = 0;
        matrix[1][1] = 0;
    }

    public aMatrix2f multiplyMatrix2f (aMatrix2f _matrix) {
        return new aMatrix2f((this.m00() * _matrix.m00()) + (this.m01() * _matrix.m10()),
                            (this.m00() * _matrix.m01()) + (this.m01() * _matrix.m11()),
                            (this.m10() * _matrix.m00()) + (this.m11() * _matrix.m10()),
                            (this.m10() * _matrix.m01()) + (this.m11() * _matrix.m11()));
    }

    public aMatrix2f addMatrix2f (aMatrix2f _matrix) {
        return new aMatrix2f(    (this.m00() + _matrix.m00()),
                                (this.m01() + _matrix.m01()),
                                (this.m10() + _matrix.m10()),
                                (this.m11() + _matrix.m11()));
    }

    public aMatrix2f substractMatrix2f (aMatrix2f _matrix) {
        return new aMatrix2f(    (this.m00() - _matrix.m00()),
                                (this.m01() - _matrix.m01()),
                                (this.m10() - _matrix.m10()),
                                (this.m11() - _matrix.m11()));
    }

    //region GETTERS
    public float[][] getMatrixArray2f () {
        return matrix;
    }
    public aMatrix2f getMatrix2f () {
        return this;
    }
    public float m00() {
        return matrix[0][0];
    }
    public float m01() {
        return matrix[0][1];
    }
    public float m10() {
        return matrix[1][0];
    }
    public float m11() {
        return matrix[1][1];
    }
    //endregion

    //region SETTERS
    public void setMatrix2f (aMatrix2f _matrix) {
        this.matrix = _matrix.getMatrixArray2f();
    }
    public void setMatrix2f (float[][] _matrix) {
        this.matrix = _matrix;
    }
    public void m00 (float _m00) {
        this.matrix[0][0] = _m00;
    }
    public void m01 (float _m01) {
        this.matrix[0][1] = _m01;
    }
    public void m10 (float _m10) {
        this.matrix[1][0] = _m10;
    }
    public void m11 (float _m11) {
        this.matrix[1][1] = _m11;
    }
    //endregion
}
