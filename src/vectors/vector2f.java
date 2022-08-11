package vectors;
import math.*;

public class vector2f {
    private float x;
    private float y;

    public vector2f (float _x, float _y) {
        x = _x;
        y = _y;
    }

    public float resolveVector2f () {
        return (operations.squareRoot(operations.square(x) + operations.square(y)));
    }

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
}
