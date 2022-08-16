package Vectors;

import Math.Operations;

public class Vector4f {
    private float x;
    private float y;
    private float z;
    private float w;

    public Vector4f(float _x, float _y, float _z, float _w) {
        x = _x;
        y = _y;
        z = _z;
        w = _w;
    }

    public Vector4f(float[] _xyzw) {
        x = _xyzw[0];
        y = _xyzw[1];
        z = _xyzw[1];
        w = _xyzw[1];
    }

    public Vector4f(float _d) {
        x = _d;
        y = _d;
        z = _d;
        w = _d;
    }

    public Vector4f() {
        x = 0;
        y = 0;
        z = 0;
        w = 0;
    }

    public float resolveVector4f () {
        return (Operations.squareRoot(
                Operations.square(x) + Operations.square(y) + Operations.square(z) + Operations.square(z)));
    }

    public Vector4f addVector4f (float _x, float _y, float _z, float _w) {
        x += _x;
        y += _y;
        z += _z;
        w += _w;

        return this;
    }

    public Vector4f addVector4f (Vector4f _vector) {
        x += _vector.getX();
        y += _vector.getY();
        z += _vector.getZ();
        w += _vector.getW();

        return this;
    }

    public Vector4f subtractVector4f (float _x, float _y, float _z, float _w) {
        x -= _x;
        y -= _y;
        z -= _z;
        w -= _w;

        return this;
    }

    public Vector4f subtractVector4f (Vector4f _vector) {
        x -= _vector.getX();
        y -= _vector.getY();
        z -= _vector.getZ();
        w -= _vector.getW();

        return this;
    }

    //region GETTERS
    public Vector4f getVector4f () {
        return this;
    }
    public float[] getVectorArray4f () {
        return new float[]{x, y, z, w};
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float getZ() {
        return z;
    }
    public float getW() {
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
