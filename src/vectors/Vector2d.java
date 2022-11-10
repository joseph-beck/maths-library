package vectors;
import maths.*;

public class Vector2d {
    private double x;
    private double y;

    public Vector2d(double _x, double _y) {
        x = _x;
        y = _y;
    }

    public Vector2d(double[] _xy) {
        x = _xy[0];
        y = _xy[1];
    }

    public Vector2d(double _d) {
        x = _d;
        y = _d;
    }

    public Vector2d() {
        x = 0;
        y = 0;
    }

    public double resolveVector2d () {
        return (Operations.squareRoot(
                Operations.square(x) + Operations.square(y)));
    }

    public Vector2d addVector2f (double _x, double _y) {
        x += _x;
        y += _y;

        return this;
    }

    public Vector2d addVector2f (Vector2d _vector) {
        x += _vector.getX();
        y += _vector.getY();

        return this;
    }

    public Vector2d subtractVector2f (double _x, double _y) {
        x -= _x;
        y -= _y;

        return this;
    }

    public Vector2d subtractVector2f (Vector2d _vector) {
        x -= _vector.getX();
        y -= _vector.getY();

        return this;
    }

    //region GETTERS
    public Vector2d getVector2d() {
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
