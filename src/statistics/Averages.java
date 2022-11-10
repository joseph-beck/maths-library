package statistics;

public class Averages {
    public static double mean (double[] _data) {
        double total = 0;

        for (int i = 0; i < _data.length; i++) {
            total += _data[i];
        }

        return total / _data.length;
    }

    public static int mean (int[] _data) {
        int total = 0;

        for (int i = 0; i < _data.length; i++) {
            total += _data[i];
        }

        return total / _data.length;
    }

    public static double median (double[] _data) {
        return 0;
    }

    public static double mode (double[] _data) {
        return 0;
    }

    public static double range (double[] _data) {
        double lower = _data[0];
        double upper = 0;

        for (int i = 0; i < _data.length; i++) {
            if (_data[i] > upper) {
                upper = _data[i];
            }
            if (lower > _data[i] ) {
                lower = _data[i];
            }
        }

        return upper - lower;
    }
}
