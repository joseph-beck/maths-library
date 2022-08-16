package Matrices;

public class Matrix2i {
    private int[][] matrix = new int[2][2];

    public Matrix2i(int _m00, int _m01,
                    int _m10, int _m11) {
        matrix[0][0] = _m00;
        matrix[0][1] = _m01;
        matrix[1][0] = _m10;
        matrix[1][1] = _m11;
    }

    public Matrix2i(int _a) {
        matrix[0][0] = _a;
        matrix[0][1] = _a;
        matrix[1][0] = _a;
        matrix[1][1] = _a;
    }

    public Matrix2i() {
        matrix[0][0] = 0;
        matrix[0][1] = 0;
        matrix[1][0] = 0;
        matrix[1][1] = 0;
    }

    public Matrix2i multiplyMatrix2i (Matrix2i matrixR) {
        return new Matrix2i(    (this.m00() * matrixR.m00()) + (this.m01() * matrixR.m10()),
                                (this.m00() * matrixR.m01()) + (this.m01() * matrixR.m11()),
                                (this.m10() * matrixR.m00()) + (this.m11() * matrixR.m10()),
                                (this.m10() * matrixR.m01()) + (this.m11() * matrixR.m11()));
    }

    public Matrix2i addMatrix2i (Matrix2i matrixR) {
        return new Matrix2i(    (this.m00() + matrixR.m00()),
                                (this.m01() + matrixR.m01()),
                                (this.m10() + matrixR.m10()),
                                (this.m11() + matrixR.m11()));
    }

    public Matrix2i substractMatrix2i (Matrix2i matrixR) {
        return new Matrix2i(    (this.m00() - matrixR.m00()),
                                (this.m01() - matrixR.m01()),
                                (this.m10() - matrixR.m10()),
                                (this.m11() - matrixR.m11()));
    }

    //region GETTERS
    public int[][] getMatrixArray2i () {
        return matrix;
    }
    public Matrix2i getMatrix2i () {
        return this;
    }
    public int m00() {
        return matrix[0][0];
    }

    public int m01() {
        return matrix[0][1];
    }

    public int m10() {
        return matrix[1][0];
    }

    public int m11() {
        return matrix[1][1];
    }
    //endregion

    //region SETTERS
    public void setMatrix2d (Matrix2i _matrix) {
        this.matrix = _matrix.getMatrixArray2i();
    }
    public void setMatrix2d (int[][] _matrix) {
        this.matrix = _matrix;
    }
    public void m00 (int _m00) {
        this.matrix[0][0] = _m00;
    }
    public void m01 (int _m01) {
        this.matrix[0][1] = _m01;
    }
    public void m10 (int _m10) {
        this.matrix[1][0] = _m10;
    }
    public void m11 (int _m11) {
        this.matrix[1][1] = _m11;
    }
    //endregion
}