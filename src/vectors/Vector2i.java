package vectors;
import maths.*;

public class Vector2i {
    private int x;
    private int y;

    public Vector2i(int _x, int _y) {
        x = _x;
        y = _x;
    }

    public Vector2i(int[] _xy) {
        x = _xy[0];
        y = _xy[1];
    }

    public Vector2i(int _d) {
        x = _d;
        y = _d;
    }

    public Vector2i() {
        x = 0;
        y = 0;
    }

    public int resolveWholeVector2i () {
        return ((int) Operations.squareRoot(Operations.square(x) + Operations.square(y)));
    }

    public float resolveVector2i () {
        return (Operations.squareRoot(Operations.square(x) + Operations.square(y)));
    }

    public Vector2i addVector2i (int _x, int _y) {
        x += _x;
        y += _y;

        return this;
    }

    public Vector2i addVector2i (Vector2i _vector) {
        x += _vector.getX();
        y += _vector.getY();

        return this;
    }

    public Vector2i subtractVector2i (int _x, int _y) {
        x -= _x;
        y -= _y;

        return this;
    }

    public Vector2i subtractVector2i (Vector2i _vector) {
        x -= _vector.getX();
        y -= _vector.getY();

        return this;
    }

    //region GETTERS
    public Vector2i getVector2i () {
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
