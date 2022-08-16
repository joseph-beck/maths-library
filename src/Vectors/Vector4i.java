package Vectors;

import Math.Operations;

public class Vector4i {
    private int x;
    private int y;
    private int z;
    private int w;

    public Vector4i(int _x, int _y, int _z, int _w) {
        x = _x;
        y = _y;
        z = _z;
        w = _w;
    }

    public Vector4i(int[] _xyzw) {
        x = _xyzw[0];
        y = _xyzw[1];
        z = _xyzw[1];
        w = _xyzw[1];
    }

    public Vector4i(int _d) {
        x = _d;
        y = _d;
        z = _d;
        w = _d;
    }

    public Vector4i() {
        x = 0;
        y = 0;
        z = 0;
        w = 0;
    }

    public int resolveWholeVector4i () {
        return ((int) Operations.squareRoot(
                Operations.square(x) + Operations.square(y) + Operations.square(z) + Operations.square(z)));
    }

    public float resolveVector4i () {
        return (Operations.squareRoot(
                Operations.square(x) + Operations.square(y) + Operations.square(z) + Operations.square(z)));
    }

    public Vector4i addVector4i (int _x, int _y, int _z, int _w) {
        x += _x;
        y += _y;
        z += _z;
        w += _w;

        return this;
    }

    public Vector4i addVector4i (Vector4i _vector) {
        x += _vector.getX();
        y += _vector.getY();
        z += _vector.getZ();
        w += _vector.getW();

        return this;
    }

    public Vector4i subtractVector4i (int _x, int _y, int _z, int _w) {
        x -= _x;
        y -= _y;
        z -= _z;
        w -= _w;

        return this;
    }

    public Vector4i subtractVector4i (Vector4i _vector) {
        x -= _vector.getX();
        y -= _vector.getY();
        z -= _vector.getZ();
        w -= _vector.getW();

        return this;
    }

    //region GETTERS
    public Vector4i getVector4i () {
        return this;
    }
    public int[] getVectorArray4i () {
        return new int[]{x, y, z, w};
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }
    public int getW() {
        return w;
    }
    //endregion

    //region SETTERS
    public void setX(int _x) {
        x = _x;
    }
    public void setY(int _y) {
        y = _y;
    }
    public void setZ(int _z) {
        z = _z;
    }
    public void setW(int _w) {
        w = _w;
    }
    //endregion
}
