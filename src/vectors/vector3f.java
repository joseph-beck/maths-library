package vectors;

import math.operations;

public class vector3f {
    private float x;
    private float y;
    private float z;

    public vector3f (float _x, float _y, float _z) {
        x = _x;
        y = _y;
        z = _z;
    }

    public float resolveVector3f () {
        return (operations.squareRoot(operations.square(x) + operations.square(y) + operations.square(z)));
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
}
