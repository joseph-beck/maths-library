package Vectors;
import Math.*;

public class Vector2f {
    private float x;
    private float y;

    public Vector2f(float _x, float _y) {
        x = _x;
        y = _y;
    }

    public Vector2f(float[] _xy) {
        x = _xy[0];
        y = _xy[1];
    }

    public Vector2f(float _d) {
        x = _d;
        y = _d;
    }

    public Vector2f() {
        x = 0;
        y = 0;
    }

    public float resolveVector2f () {
        return (Operations.squareRoot(Operations.square(x) + Operations.square(y)));
    }

    public Vector2f addVector2f (float _x, float _y) {
        x += _x;
        y += _y;

        return this;
    }

    public Vector2f addVector2f (Vector2f _vector) {
        x += _vector.getX();
        y += _vector.getY();

        return this;
    }

    public Vector2f subtractVector2f (float _x, float _y) {
        x -= _x;
        y -= _y;

        return this;
    }

    public Vector2f subtractVector2f (Vector2f _vector) {
        x -= _vector.getX();
        y -= _vector.getY();

        return this;
    }

    //region GETTERS
    public Vector2f getVector2f () {
        return this;
    }
    public float[] getVectorArray2f () {
        return new float[]{x, y};
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    //endregion

    //region SETTERS
    public void setX (float _x) {
        x = _x;
    }

    public void setY (float _y) {
        y = _y;
    }
    //endregion
}
