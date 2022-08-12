package math;

import physics.constants;

public class circles {
    public static double radiusToDiameter (double radius) {
        return 2 * radius;
    }

    public static double diameterToRadius (double diameter) {
        return diameter / 2;
    }

    public static double circumferenceRadius (double _radius) {
        return 2 * _radius * constants.getPi();
    }

    public static double circumferenceDiameter (double _diameter) {
        return _diameter * constants.getPi();
    }

    public static double areaCircle (double _radius) {
        return operations.square(_radius) * constants.getPi();
    }

    public static double areaSectorDegrees (double _radius, double _angle) {
        // a = r^2 * t

        if (_angle > 360) {
            System.out.println("Error, angle out of range");
            return 0;
        }

        double angle = Math.toRadians(_angle);
        return operations.square(_radius) * angle;
    }

    public static double areaSectorRadians (double _radius, double _angle) {
        // a = r^2 * t

        if (_angle > 2) {
            System.out.println("Error, angle out of range");
            return 0;
        }

        return operations.square(_radius) * _angle;
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
        return 2 * _radius * (float)constants.getPi();
    }

    public static float circumferenceDiameter (float _diameter) {
        return _diameter * (float)constants.getPi();
    }

    public static float areaCircle (float _radius) {
        return operations.square(_radius) * (float)constants.getPi();
    }

    public static float areaSectorDegrees (float _radius, float _angle) {
        // a = r^2 * t

        if (_angle > 360) {
            System.out.println("Error, angle out of range");
            return 0;
        }

        float angle = (float)Math.toRadians(_angle);
        return operations.square(_radius) * angle;
    }

    public static float areaSectorRadians (float _radius, float _angle) {
        // a = r^2 * t

        if (_angle > 2) {
            System.out.println("Error, angle out of range");
            return 0;
        }

        return operations.square(_radius) * _angle;
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
