package vectors;

import math.operations;

public class vector4f {
    private float x;
    private float y;
    private float z;
    private float w;

    public vector4f (float _x, float _y, float _z, float _w) {
        x = _x;
        y = _y;
        z = _z;
        w = _w;
    }

    public vector4f (float[] _xyzw) {
        x = _xyzw[0];
        y = _xyzw[1];
        z = _xyzw[1];
        w = _xyzw[1];
    }

    public vector4f (float _d) {
        x = _d;
        y = _d;
        z = _d;
        w = _d;
    }

    public vector4f () {
        x = 0;
        y = 0;
        z = 0;
        w = 0;
    }

    public float resolveVector4f () {
        return (operations.squareRoot(
                operations.square(x) + operations.square(y) + operations.square(z) + operations.square(z)));
    }

    public vector4f addVector4f (float _x, float _y, float _z, float _w) {
        x += _x;
        y += _y;
        z += _z;
        w += _w;

        return this;
    }

    public vector4f addVector4f (vector4f _vector) {
        x += _vector.getX();
        y += _vector.getY();
        z += _vector.getZ();
        w += _vector.getW();

        return this;
    }

    public vector4f subtractVector4f (float _x, float _y, float _z, float _w) {
        x -= _x;
        y -= _y;
        z -= _z;
        w -= _w;

        return this;
    }

    public vector4f subtractVector4f (vector4f _vector) {
        x -= _vector.getX();
        y -= _vector.getY();
        z -= _vector.getZ();
        w -= _vector.getW();

        return this;
    }

    //region GETTERS
    public vector4f getVector4f () {
        return this;
    }
    public float[] getVectorArray4f () {
        return new float[]{x, y, z, w};
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
    public void setX(float _x) {
        x = _x;
    }
    public void setY(float _y) {
        y = _y;
    }
    public void setZ(float _z) {
        z = _z;
    }
    public void setW(float _w) {
        w = _w;
    }
    //endregion
}
