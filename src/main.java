import math.*;
import statistics.*;
import outputs.*;
import sorters.*;
import matrices.*;
import vectors.*;

public class main  {
    public static void main(String[] args) {
        matrix4d matrix1 = new matrix4d(1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8);
        matrix4d matrix2 = new matrix4d(1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8);

        matrix1 = matrix1.multiplyMatrix4d(matrix2);
        double[][] matrix = matrix1.getMatrixArray4d();

        arrays.outputTwoD(matrix);
    }
}
