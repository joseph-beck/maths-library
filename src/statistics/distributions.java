package statistics;
import math.*;


public class distributions {
    public static double deviation(double[] _data) {
        return 0;
    }

    public static double standardDeviationPopulation(double[] _data) {
        // ans = sqrt((sum - mean)^2 / n)

        double x = 0;
        double n = _data.length;
        double mean = averages.mean(_data);

        for (int i = 0; i < _data.length; i++) {
            x += operations.square(_data[i] - mean);
        }

        return operations.squareRoot(x / n);
    }

    public static double variancePopulation (double[] _data) {
        double standardDeviation = standardDeviationPopulation(_data);

        return operations.square(standardDeviation);
    }

    public static double standardDeviationSample(double[] _data) {
        // ans = sqrt((sum - mean)^2 / n)

        double x = 0;
        double n = _data.length - 1;
        double mean = averages.mean(_data);

        for (int i = 0; i < _data.length; i++) {
            x += operations.square(_data[i] - mean);
        }

        return operations.squareRoot(x / n);
    }

    public static double varianceSample (double[] _data) {
        double standardDeviation = standardDeviationSample(_data);

        return operations.square(standardDeviation);
    }
}
