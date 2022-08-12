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

    public static float sin (float _x) {
        _x = (float)Math.toRadians(_x);
        return (float)Math.sin(_x);
    }

    public static float cosec (float _x) {
        _x = (float)Math.toRadians(_x);
        return 1 / (float)Math.sin(_x);
    }

    public static float cos (float _x) {
        _x = (float)Math.toRadians(_x);
        return (float)Math.cos(_x);
    }

    public static float sec (float _x) {
        _x = (float)Math.toRadians(_x);
        return 1 / (float)Math.cos(_x);
    }

    public static float tan (float _x) {
        _x = (float)Math.toRadians(_x);
        return (float)Math.tan(_x);
    }

    public static float cot (float _x) {
        _x = (float)Math.toRadians(_x);
        return 1 / (float)Math.tan(_x);
    }
}
