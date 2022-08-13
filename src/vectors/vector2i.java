package vectors;
import math.*;

public class vector2i {
    private int x;
    private int y;

    public vector2i (int _x, int _y) {
        x = _x;
        y = _x;
    }

    public vector2i (int[] _xy) {
        x = _xy[0];
        y = _xy[1];
    }

    public vector2i (int _d) {
        x = _d;
        y = _d;
    }

    public vector2i () {
        x = 0;
        y = 0;
    }

    public int resolveWholeVector2i () {
        return ((int)operations.squareRoot(operations.square(x) + operations.square(y)));
    }

    public float resolveVector2i () {
        return (operations.squareRoot(operations.square(x) + operations.square(y)));
    }

    public vector2i addVector2i (int _x, int _y) {
        x += _x;
        y += _y;

        return this;
    }

    public vector2i addVector2i (vector2i _vector) {
        x += _vector.getX();
        y += _vector.getY();

        return this;
    }

    public vector2i subtractVector2i (int _x, int _y) {
        x -= _x;
        y -= _y;

        return this;
    }

    public vector2i subtractVector2i (vector2i _vector) {
        x -= _vector.getX();
        y -= _vector.getY();

        return this;
    }

    //region GETTERS
    public vector2i getVector2i () {
        return this;
    }
    public int[] getVectorArray2i () {
        return new int[]{x, y};
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    //endregion

    //region SETTERS
    public void setX (int _x) {
        x = _x;
    }

    public void setY (int _y) {
        y = _y;
    }
    //endregion
}
