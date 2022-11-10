package vectors;

import maths.Operations;

public class Vector3f {
    private float x;
    private float y;
    private float z;

    public Vector3f(float _x, float _y, float _z) {
        x = _x;
        y = _y;
        z = _z;
    }

    public Vector3f(float[] _xyz) {
        x = _xyz[0];
        y = _xyz[1];
        z = _xyz[2];
    }

    public Vector3f(float _d) {
        x = _d;
        y = _d;
        z = _d;
    }

    public Vector3f() {
        x = 0;
        y = 0;
        z = 0;
    }

    public float resolveVector3f () {
        return (Operations.squareRoot(Operations.square(x) + Operations.square(y) + Operations.square(z)));
    }

    public Vector3f addVector3f (float _x, float _y, float _z) {
        x += _x;
        y += _y;
        z += _z;

        return this;
    }

    public Vector3f addVector3f (Vector3f _vector) {
        x += _vector.getX();
        y += _vector.getY();
        z += _vector.getZ();

        return this;
    }

    public Vector3f subtractVector3f (float _x, float _y, float _z) {
        x -= _x;
        y -= _y;
        z -= _z;

        return this;
    }

    public Vector3f subtractVector3f (Vector3f _vector) {
        x -= _vector.getX();
        y -= _vector.getY();
        z -= _vector.getZ();

        return this;
    }

    //region GETTERS
    public Vector3f getVector3f () {
        return this;
    }
    public float[] getVectorArray3f () {
        return new float[]{x, y, z};
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
    //endregion
}
