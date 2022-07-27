package math;

public class operations {

    public static int add(int _a, int _b) {
        return _a + _b;
    }

    public static int subtract () {
        return 1;
    }

    public static int multiply () {
        return 1;
    }

    public static int divide () {
        return 1;
    }

    public static double sigma(double[] _data) {
        double total = 0;

        for (int i = 0; i < _data.length; i++) {
            total += _data[i];
        }

        return total;
    }

    public static int square (int _x) {
        return _x * _x;
    }

    public static double square (double _x) {
        return _x * _x;
    }

    public static int cube (int _x) {
        return _x * _x * _x;
    }

    public static double squareRoot (double _x) {
        return Math.sqrt(_x);
    }
}
