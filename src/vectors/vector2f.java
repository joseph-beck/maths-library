package vectors;
import math.*;

public class vector2f {
    private float x;
    private float y;

    public vector2f (float _x, float _y) {
        x = _x;
        y = _y;
    }

    public vector2f (float[] _xy) {
        x = _xy[0];
        y = _xy[1];
    }

    public vector2f (float _d) {
        x = _d;
        y = _d;
    }

    public vector2f () {
        x = 0;
        y = 0;
    }

    public float resolveVector2f () {
        return (operations.squareRoot(operations.square(x) + operations.square(y)));
    }

    public vector2f addVector2f (float _x, float _y) {
        x += _x;
        y += _y;

        return this;
    }

    public vector2f addVector2f (vector2f _vector) {
        x += _vector.getX();
        y += _vector.getY();

        return this;
    }

    public vector2f subtractVector2f (float _x, float _y) {
        x -= _x;
        y -= _y;

        return this;
    }

    public vector2f subtractVector2f (vector2f _vector) {
        x -= _vector.getX();
        y -= _vector.getY();

        return this;
    }

    //region GETTERS
    public vector2f getVector2f () {
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
