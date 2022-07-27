package math;

public class degrees {
    public static double sin (double _x) {
        _x = Math.toRadians(_x);
        return Math.sin(_x);
    }

    public static double cosec (double _x) {
        _x = Math.toRadians(_x);
        return 1 / Math.sin(_x);
    }

    public static double cos (double _x) {
        _x = Math.toRadians(_x);
        return Math.cos(_x);
    }

    public static double sec (double _x) {
        _x = Math.toRadians(_x);
        return 1 / Math.cos(_x);
    }

    public static double tan (double _x) {
        _x = Math.toRadians(_x);
        return Math.tan(_x);
    }

    public static double cot (double _x) {
        _x = Math.toRadians(_x);
        return 1 / Math.tan(_x);
    }
}
