package statistics;
import math.*;


public class distributions {
    public static double deviation(double[] _data) {
        return 0;
    }

    public static double standardDeviation(double[] _data) {
        // ans = sqrt((sum - mean)^2 / n)

        double x = 0;
        double n = _data.length;
        double mean = averages.mean(_data);

        for (int i = 0; i < _data.length; i++) {
            x += operations.square(_data[i] - mean);
        }

        return operations.squareRoot(x / n);
    }
}
