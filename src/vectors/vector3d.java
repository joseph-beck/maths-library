package vectors;
import math.*;

public class vector3d {
    private double x;
    private double y;
    private double z;

    public vector3d (double _x, double _y, double _z) {
        x = _x;
        y = _y;
        z = _z;
    }

    public double resolveVector3d () {
        return (operations.squareRoot(operations.square(x) + operations.square(y) + operations.square(z)));
    }

    public double getX () {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
}
