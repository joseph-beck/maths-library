package outputs;
import vectors.*;

public class vectors {
    public void outputVector2f (float _x, float _y) {
        System.out.println("X: " + _x + "Y: " + _y);
    }
    public void outputVector2f (vector2f _vector) {
        System.out.println("X: " + _vector.getX() + "Y: " + _vector.getY());
    }
    public void outputVector2d (double _x, double _y) {
        System.out.println("X: " + _x + "Y: " + _y);
    }
    public void outputVector2d (vector2d _vector) {
        System.out.println("X: " + _vector.getX() + "Y: " + _vector.getY());
    }
    public void outputVector3f (float _x, float _y, float _z) {
        System.out.println("X: " + _x + "Y: " + _y + "Z: " + _z);
    }
    public void outputVector3f (vector3f _vector) {
        System.out.println("X: " + _vector.getX() + "Y: " + _vector.getY() + "Z: " + _vector.getZ());
    }
    public void outputVector3d (double _x, double _y, double _z) {
        System.out.println("X: " + _x + "Y: " + _y + "Z: " + _z);
    }
    public void outputVector3d (vector3d _vector) {
        System.out.println("X: " + _vector.getX() + "Y: " + _vector.getY() + "Z: " + _vector.getZ());
    }
}
