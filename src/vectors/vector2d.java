package vectors;
import math.*;

public class vector2d {
    private double x;
    private double y;

    public vector2d (double _x, double _y) {
        x = _x;
        y = _y;
    }

    public double resolveVector2d () {
        return (operations.squareRoot(operations.square(x) + operations.square(y)));
    }

    public double getX () {
        return x;
    }
    public double getY() {
        return y;
    }
}
