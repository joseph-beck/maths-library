package vectors;

import math.operations;

public class vector4i {
    private int x;
    private int y;
    private int z;
    private int w;

    public vector4i (int _x, int _y, int _z, int _w) {
        x = _x;
        y = _y;
        z = _z;
        w = _w;
    }

    public vector4i (int[] _xyzw) {
        x = _xyzw[0];
        y = _xyzw[1];
        z = _xyzw[1];
        w = _xyzw[1];
    }

    public vector4i (int _d) {
        x = _d;
        y = _d;
        z = _d;
        w = _d;
    }

    public vector4i () {
        x = 0;
        y = 0;
        z = 0;
        w = 0;
    }

    public int resolveWholeVector4i () {
        return ((int)operations.squareRoot(
                operations.square(x) + operations.square(y) + operations.square(z) + operations.square(z)));
    }

    public float resolveVector4i () {
        return (operations.squareRoot(
                operations.square(x) + operations.square(y) + operations.square(z) + operations.square(z)));
    }

    public vector4i addVector4i (int _x, int _y, int _z, int _w) {
        x += _x;
        y += _y;
        z += _z;
        w += _w;

        return this;
    }

    public vector4i addVector4i (vector4i _vector) {
        x += _vector.getX();
        y += _vector.getY();
        z += _vector.getZ();
        w += _vector.getW();

        return this;
    }

    public vector4i subtractVector4i (int _x, int _y, int _z, int _w) {
        x -= _x;
        y -= _y;
        z -= _z;
        w -= _w;

        return this;
    }

    public vector4i subtractVector4i (vector4i _vector) {
        x -= _vector.getX();
        y -= _vector.getY();
        z -= _vector.getZ();
        w -= _vector.getW();

        return this;
    }

    //region GETTERS
    public vector4i getVector4i () {
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
