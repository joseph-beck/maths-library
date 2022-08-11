import math.*;
import statistics.*;
import outputs.*;
import sorters.*;
import matrices.*;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] data = {7, 1, 2, 5, 3, 6, 4};
        //System.out.println(distributions.standardDeviationPopulation(data));
        //System.out.println(distributions.variancePopulation(data));

        //System.out.println(distributions.standardDeviationSample(data));
        //System.out.println(distributions.varianceSample(data));

        matrix2d matrix2 = new matrix2d(1, 2, 7,  5);
        matrix2d identityMatrix = new matrix2d(1, 0, 0,  1);

        matrix2d anotherMatrix = new matrix2d(7, 12, 5, 1);

        arrays.outputOneD(merge.mergeSort(data));
        arrays.outputTwoD(matrix2.getMatrix2d());

        matrix2 = matrix2.addMatrix2d(matrix2);

        arrays.outputTwoD(matrix2.getMatrix2d());

        matrix3d matrix3 = new matrix3d(1, 2, 3, 4, 5, 6, 7, 8, 9);
        matrix3d matrix33 = new matrix3d(1, 2, 3, 4, 5, 6, 7, 8, 9);

        matrix3 = matrix3.multiplyMatrix3d(matrix33);

        arrays.outputTwoD(matrix3.getMatrix3d());

    }
}
