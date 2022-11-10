package matrices;

public class aMatrix2d {
    private double[][] matrix = new double[2][2];

    public aMatrix2d(double m00, double m01,
                     double m10, double m11) {
        matrix[0][0] = m00;
        matrix[0][1] = m01;
        matrix[1][0] = m10;
        matrix[1][1] = m11;
    }

    public aMatrix2d(double _a) {
        matrix[0][0] = _a;
        matrix[0][1] = _a;
        matrix[1][0] = _a;
        matrix[1][1] = _a;
    }

    public aMatrix2d() {
        matrix[0][0] = 0;
        matrix[0][1] = 0;
        matrix[1][0] = 0;
        matrix[1][1] = 0;
    }

    public aMatrix2d multiplyMatrix2d (aMatrix2d matrixR) {
        /*
            [a00][a01] * [b00][b01] = [a00 * b00 + a01 * b10][a00 * b01 + a01 * b11]
            [a10][a11]   [b10][b11]   [a10 * b00 + a11 * b10][a10 * b01 + a11 * b11]
         */

        return new aMatrix2d(    (this.m00() * matrixR.m00()) + (this.m01() * matrixR.m10()),
                                (this.m00() * matrixR.m01()) + (this.m01() * matrixR.m11()),
                                (this.m10() * matrixR.m00()) + (this.m11() * matrixR.m10()),
                                (this.m10() * matrixR.m01()) + (this.m11() * matrixR.m11()));
    }

    public aMatrix2d addMatrix2d (aMatrix2d matrixR) {
        return new aMatrix2d(    (this.m00() + matrixR.m00()),
                                (this.m01() + matrixR.m01()),
                                (this.m10() + matrixR.m10()),
                                (this.m11() + matrixR.m11()));
    }

    public aMatrix2d substractMatrix2d (aMatrix2d matrixR) {
        return new aMatrix2d(    (this.m00() - matrixR.m00()),
                                (this.m01() - matrixR.m01()),
                                (this.m10() - matrixR.m10()),
                                (this.m11() - matrixR.m11()));
    }

    //region GETTERS
    public double[][] getMatrixArray2d () { return matrix; }
    public aMatrix2d getMatrix2d () { return this; }
    public double m00() { return matrix[0][0]; }
    public double m01() { return matrix[0][1]; }
    public double m10() { return matrix[1][0]; }
    public double m11() { return matrix[1][1]; }
    //endregion

    //region SETTERS
    public void setMatrix2d (aMatrix2d _matrix) { this.matrix = _matrix.getMatrixArray2d(); }
    public void setMatrix2d (double[][] _matrix) { this.matrix = _matrix; }
    public void m00 (double m00) { this.matrix[0][0] = m00; }
    public void m01 (double m01) { this.matrix[0][1] = m01; }
    public void m10 (double m10) { this.matrix[1][0] = m10; }
    public void m11 (double m11) { this.matrix[1][1] = m11; }
    //endregion
}