package vectors;
import math.*;

public class vector2d {
    private double x;
    private double y;

    public vector2d (double _x, double _y) {
        x = _x;
        y = _y;
    }

    public vector2d (double[] _xy) {
        x = _xy[0];
        y = _xy[1];
    }

    public vector2d (double _d) {
        x = _d;
        y = _d;
    }

    public vector2d () {
        x = 0;
        y = 0;
    }

    public double resolveVector2d () {
        return (operations.squareRoot(
                operations.square(x) + operations.square(y)));
    }

    public vector2d addVector2f (double _x, double _y) {
        x += _x;
        y += _y;

        return this;
    }

    public vector2d addVector2f (vector2d _vector) {
        x += _vector.getX();
        y += _vector.getY();

        return this;
    }

    public vector2d subtractVector2f (double _x, double _y) {
        x -= _x;
        y -= _y;

        return this;
    }

    public vector2d subtractVector2f (vector2d _vector) {
        x -= _vector.getX();
        y -= _vector.getY();

        return this;
    }

    //region GETTERS
    public vector2d getVector2d() {
        return this;
    }
    public double[] getVectorArray2d() {
        return new double[]{x, y};
    }
    public double getX () {
        return x;
    }
    public double getY() {
        return y;
    }
    //endregion

    //region SETTERS
    public void setX (double _x) {
        x = _x;
    }
    public void setY (double _y) {
        y = _y;
    }
    //endregion
}
