package physics;

import maths.Operations;

public class Motion {
    /*
        s = displacement
        u = initial velocity
        v = final velocity
        a = acceleration
        t = time
     */

    public static double displacementUAT (double _u, double _a, double _t) {
        // s = ut + 1/2at^2

        return (_u * _t) + (0.5 * _a * Operations.square(_t));
    }

    public static double displacementVAT (double _v, double _a, double _t) {
        // s = vt - 1/2at^2

        return (_v * _t) - (0.5 * _a * Operations.square(_t));
    }

    public static double displacementUVT (double _u, double _v, double _t) {
        // s = 1/2(u + v)t

        return (0.5 * (_u + _v)) * _t;
    }

    public static double finalVelocityUAT (double _u, double _a, double _t) {
        // v = u + at

        return _u + (_a * _t);
    }

    public static double finalVelocitySUA (double _s, double _u, double _a) {
        // v^2 = u^2 + 2as

        return Operations.squareRoot(Operations.square(_u) + (2 * _a * _s));
    }


}
