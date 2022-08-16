package Vectors;
import Math.*;

public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double _x, double _y, double _z) {
        x = _x;
        y = _y;
        z = _z;
    }
    public Vector3d(double[] _xyz) {
        x = _xyz[0];
        y = _xyz[1];
        z = _xyz[2];
    }

    public Vector3d(double _d) {
        x = _d;
        y = _d;
        z = _d;
    }

    public Vector3d() {
        x = 0;
        y = 0;
        z = 0;
    }

    public double resolveVector3d () {
        return (Operations.squareRoot(Operations.square(x) + Operations.square(y) + Operations.square(z)));
    }

    public Vector3d addVector3d (double _x, double _y, double _z) {
        x += _x;
        y += _y;
        z += _z;

        return this;
    }

    public Vector3d addVector3d (Vector3d _vector) {
        x += _vector.getX();
        y += _vector.getY();
        z += _vector.getZ();

        return this;
    }

    public Vector3d subtractVector3d (double _x, double _y, double _z) {
        x -= _x;
        y -= _y;
        z -= _z;

        return this;
    }

    public Vector3d subtractVector3d (Vector3d _vector) {
        x -= _vector.getX();
        y -= _vector.getY();
        z -= _vector.getZ();

        return this;
    }

    //region GETTERS
    public Vector3d getVector3d () {
        return this;
    }
    public double[] getVectorArray3d () {
        return new double[]{x, y, z};
    }
    public double getX () {
        return x;
    }
    public double getY () {
        return y;
    }
    public double getZ () {
        return z;
    }
    //endregion

    //region SETTERS
    public void setX (double _x) {
        x = _x;
    }
    public void setY (double _y) {
        y = _y;
    }
    public void setZ (double _z) {
        z = _z;
    }
    //endregion
}
