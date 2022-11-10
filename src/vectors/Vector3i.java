package vectors;

import maths.Operations;

public class Vector3i {
    private int x;
    private int y;
    private int z;

    public Vector3i(int _x, int _y, int _z) {
        x = _x;
        y = _y;
        z = _z;
    }

    public Vector3i(int[] _xyz) {
        x = _xyz[0];
        y = _xyz[1];
        z = _xyz[2];
    }

    public Vector3i(int _d) {
        x = _d;
        y = _d;
        z = _d;
    }

    public Vector3i() {
        x = 0;
        y = 0;
        z = 0;
    }

    public int resolveWholeVector3i () {
        return ((int) Operations.squareRoot(Operations.square(x) + Operations.square(y) + Operations.square(z)));
    }

    public float resolveVector3i () {
        return (Operations.squareRoot(Operations.square(x) + Operations.square(y) + Operations.square(z)));
    }

    public Vector3i addVector3i (int _x, int _y, int _z) {
        x += _x;
        y += _y;
        z += _z;

        return this;
    }

    public Vector3i addVector3f (Vector3i _vector) {
        x += _vector.getX();
        y += _vector.getY();
        z += _vector.getZ();

        return this;
    }

    public Vector3i subtractVector3i (int _x, int _y, int _z) {
        x -= _x;
        y -= _y;
        z -= _z;

        return this;
    }

    public Vector3i subtractVector3i (Vector3i _vector) {
        x -= _vector.getX();
        y -= _vector.getY();
        z -= _vector.getZ();

        return this;
    }

    //region GETTERS
    public Vector3i getVector3i () {
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
