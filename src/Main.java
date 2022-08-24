import Outputs.*;
import Matrices.*;
import Window.*;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();

        Matrix4d matrix1 = new Matrix4d(1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8);
        Matrix4d matrix2 = new Matrix4d(1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8);

        matrix1 = matrix1.multiplyMatrix4d(matrix2);
        double[][] matrix = matrix1.getMatrixArray4d();

        Arrays.outputTwoD(matrix);

        Matrix2d matrix2d = new Matrix2d(1, 2, 3, 4);
        Matrices.outputMatrix2d(matrix2d);
    }
}
