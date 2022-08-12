package vectors;
import math.*;

public class vector4d {
    private double x;
    private double y;
    private double z;
    private double w;

    public vector4d (double _x, double _y, double _z, double _w) {
        x = _x;
        y = _y;
        z = _z;
        w = _w;
    }

    public vector4d (double[] _xyzw) {
        x = _xyzw[0];
        y = _xyzw[1];
        z = _xyzw[1];
        w = _xyzw[1];
    }

    public vector4d (double _d) {
        x = _d;
        y = _d;
        z = _d;
        w = _d;
    }

    public vector4d () {
        x = 0;
        y = 0;
        z = 0;
        w = 0;
    }

    public double resolveVector4d () {
        return (operations.squareRoot(
                operations.square(x) + operations.square(y) + operations.square(z) + operations.square(z)));
    }

    public vector4d addVector4d (double _x, double _y, double _z, double _w) {
        x += _x;
        y += _y;
        z += _z;
        w += _w;

        return this;
    }

    public vector4d addVector4d (vector4d _vector) {
        x += _vector.getX();
        y += _vector.getY();
        z += _vector.getZ();
        w += _vector.getW();

        return this;
    }

    public vector4d subtractVector4d (double _x, double _y, double _z, double _w) {
        x -= _x;
        y -= _y;
        z -= _z;
        w -= _w;

        return this;
    }

    public vector4d subtractVector4d (vector4d _vector) {
        x -= _vector.getX();
        y -= _vector.getY();
        z -= _vector.getZ();
        w -= _vector.getW();

        return this;
    }

    //region GETTERS
    public vector4d getVector4d () {
        return this;
    }
    public double[] getVectorArray4d () {
        return new double[]{x, y, z, w};
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public double getW() {
        return w;
    }
    //endregion

    //region SETTERS
    public void setX(double _x) {
        x = _x;
    }
    public void setY(double _y) {
        y = _y;
    }
    public void setZ(double _z) {
        z = _z;
    }
    public void setW(double _w) {
        w = _w;
    }
    //endregion
}
