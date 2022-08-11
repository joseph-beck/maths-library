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
    public vector3d (double[] _xyz) {
        x = _xyz[0];
        y = _xyz[1];
        z = _xyz[2];
    }

    public vector3d (double _d) {
        x = _d;
        y = _d;
        z = _d;
    }

    public vector3d () {
        x = 0;
        y = 0;
        z = 0;
    }

    public double resolveVector3d () {
        return (operations.squareRoot(operations.square(x) + operations.square(y) + operations.square(z)));
    }

    public vector3d addVector3d (double _x, double _y, double _z) {
        x += _x;
        y += _y;
        z += _z;

        return this;
    }

    public vector3d addVector3d (vector3d _vector) {
        x += _vector.getX();
        y += _vector.getY();
        z += _vector.getZ();

        return this;
    }

    public vector3d subtractVector3d (double _x, double _y, double _z) {
        x -= _x;
        y -= _y;
        z -= _z;

        return this;
    }

    public vector3d subtractVector3d (vector3d _vector) {
        x -= _vector.getX();
        y -= _vector.getY();
        z -= _vector.getZ();

        return this;
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
