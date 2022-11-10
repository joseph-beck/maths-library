package maths;

import physics.Constants;

public class Circles {
    public static double radiusToDiameter (double radius) {
        return 2 * radius;
    }

    public static double diameterToRadius (double diameter) {
        return diameter / 2;
    }

    public static double circumferenceRadius (double _radius) {
        return 2 * _radius * Constants.getPi();
    }

    public static double circumferenceDiameter (double _diameter) {
        return _diameter * Constants.getPi();
    }

    public static double areaCircle (double _radius) {
        return Operations.square(_radius) * Constants.getPi();
    }

    public static double areaSectorDegrees (double _radius, double _angle) {
        // a = r^2 * t

        if (_angle > 360) {
            System.out.println("Error, angle out of range");
            return 0;
        }

        double angle = Math.toRadians(_angle);
        return Operations.square(_radius) * angle;
    }

    public static double areaSectorRadians (double _radius, double _angle) {
        // a = r^2 * t

        if (_angle > 2) {
            System.out.println("Error, angle out of range");
            return 0;
        }

        return Operations.square(_radius) * _angle;
    }

    public static double arcDegrees (double _radius, double _angle) {
        // l = r * t

        double angle = Math.toRadians(_angle);
        return _radius * angle;
    }

    public static double arcRadians (double _radius, double _angle) {
        // l = r * t

        return _radius * _angle;
    }

    public static float radiusToDiameter (float radius) {
        return 2 * radius;
    }

    public static float diameterToRadius (float diameter) {
        return diameter / 2;
    }

    public static float circumferenceRadius (float _radius) {
        return 2 * _radius * (float) Constants.getPi();
    }

    public static float circumferenceDiameter (float _diameter) {
        return _diameter * (float) Constants.getPi();
    }

    public static float areaCircle (float _radius) {
        return Operations.square(_radius) * (float) Constants.getPi();
    }

    public static float areaSectorDegrees (float _radius, float _angle) {
        // a = r^2 * t

        if (_angle > 360) {
            System.out.println("Error, angle out of range");
            return 0;
        }

        float angle = (float)Math.toRadians(_angle);
        return Operations.square(_radius) * angle;
    }

    public static float areaSectorRadians (float _radius, float _angle) {
        // a = r^2 * t

        if (_angle > 2) {
            System.out.println("Error, angle out of range");
            return 0;
        }

        return Operations.square(_radius) * _angle;
    }

    public static double arcDegrees (float _radius, float _angle) {
        // l = r * t

        double angle = Math.toRadians(_angle);
        return _radius * angle;
    }

    public static double arcRadians (float _radius, float _angle) {
        // l = r * t

        return _radius * _angle;
    }
}
