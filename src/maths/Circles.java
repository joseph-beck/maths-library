package maths;

import physics.Constants;

public class Circles {
    public static double radiusToDiameter (double radius) { return 2 * radius; }

    public static double diameterToRadius (double diameter) { return diameter / 2; }

    public static double circumferenceRadius (double _radius) { return 2 * _radius * Constants.getPi(); }

    public static double circumferenceDiameter (double _diameter) { return _diameter * Constants.getPi(); }

    public static double areaCircle (double _radius) { return Operations.square(_radius) * Constants.getPi(); }

    public static double areaSectorDegrees (double radius, double angle) {
        // a = r^2 * t

        if (angle > 360) {
            System.out.println("Error, angle out of range");
            return 0;
        }

        angle = Math.toRadians(angle);
        return Operations.square(radius) * angle;
    }

    public static double areaSectorRadians (double radius, double angle) {
        // a = r^2 * t

        if (angle > 2) {
            System.out.println("Error, angle out of range");
            return 0;
        }

        return Operations.square(radius) * angle;
    }

    public static double arcDegrees (double radius, double angle) {
        // l = r * t

        angle = Math.toRadians(angle);
        return radius * angle;
    }

    public static double arcRadians (double radius, double angle) {
        // l = r * t

        return radius * angle;
    }

    public static float radiusToDiameter (float radius) { return 2 * radius; }

    public static float diameterToRadius (float diameter) { return diameter / 2; }

    public static float circumferenceRadius (float radius) { return 2 * radius * (float) Constants.getPi(); }

    public static float circumferenceDiameter (float diameter) { return diameter * (float) Constants.getPi(); }

    public static float areaCircle (float radius) { return Operations.square(radius) * (float) Constants.getPi(); }

    public static float areaSectorDegrees (float radius, float angle) {
        // a = r^2 * t

        if (angle > 360) {
            System.out.println("Error, angle out of range");
            return 0;
        }

        angle = (float)Math.toRadians(angle);
        return Operations.square(radius) * angle;
    }

    public static float areaSectorRadians (float radius, float angle) {
        // a = r^2 * t

        if (angle > 2) {
            System.out.println("Error, angle out of range");
            return 0;
        }

        return Operations.square(radius) * angle;
    }

    public static double arcDegrees (float radius, float angle) {
        // l = r * t

        double angleR = Math.toRadians(angle);
        return radius * angleR;
    }

    public static double arcRadians (float radius, float angle) {
        // l = r * t

        return radius * angle;
    }
}
