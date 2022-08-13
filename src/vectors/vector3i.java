package vectors;

import math.operations;

public class vector3i {
    private int x;
    private int y;
    private int z;

    public vector3i (int _x, int _y, int _z) {
        x = _x;
        y = _y;
        z = _z;
    }

    public vector3i (int[] _xyz) {
        x = _xyz[0];
        y = _xyz[1];
        z = _xyz[2];
    }

    public vector3i (int _d) {
        x = _d;
        y = _d;
        z = _d;
    }

    public vector3i () {
        x = 0;
        y = 0;
        z = 0;
    }

    public int resolveWholeVector3i () {
        return ((int)operations.squareRoot(operations.square(x) + operations.square(y) + operations.square(z)));
    }

    public float resolveVector3i () {
        return (operations.squareRoot(operations.square(x) + operations.square(y) + operations.square(z)));
    }

    public vector3i addVector3i (int _x, int _y, int _z) {
        x += _x;
        y += _y;
        z += _z;

        return this;
    }

    public vector3i addVector3f (vector3i _vector) {
        x += _vector.getX();
        y += _vector.getY();
        z += _vector.getZ();

        return this;
    }

    public vector3i subtractVector3i (int _x, int _y, int _z) {
        x -= _x;
        y -= _y;
        z -= _z;

        return this;
    }

    public vector3i subtractVector3i (vector3i _vector) {
        x -= _vector.getX();
        y -= _vector.getY();
        z -= _vector.getZ();

        return this;
    }

    //region GETTERS
    public vector3i getVector3i () {
        return this;
    }
    public int[] getVectorArray3i () {
        return new int[]{x, y, z};
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
    //endregion
}
