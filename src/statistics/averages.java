package statistics;

public class averages {
    public static double mean (double[] _data) {
        double total = 0;

        for (int i = 0; i < _data.length; i++){
            total += _data[i];
        }

        return total / _data.length;
    }

    public static int mean (int[] _data) {
        int total = 0;

        for (int i = 0; i < _data.length; i++){
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
        double lower = 0;
        double upper = 0;

        for (int i = 0; i < _data.length; i++) {

        }

        return 0;
    }
}
