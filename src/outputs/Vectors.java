package outputs;
import vectors.*;

public class Vectors {
    public static void outputVector2f (float _x, float _y) {
        System.out.println("X: " + _x + "Y: " + _y);
    }
    public static void outputVector2f (Vector2f _vector) {
        System.out.println("X: " + _vector.getX() + "Y: " + _vector.getY());
    }
    public static void outputVector2d (double _x, double _y) {
        System.out.println("X: " + _x + "Y: " + _y);
    }
    public static void outputVector2d (Vector2d _vector) {
        System.out.println("X: " + _vector.getX() + "Y: " + _vector.getY());
    }
    public static void outputVector3f (float _x, float _y, float _z) {
        System.out.println("X: " + _x + "Y: " + _y + "Z: " + _z);
    }
    public static void outputVector3f (Vector3f _vector) {
        System.out.println("X: " + _vector.getX() + "Y: " + _vector.getY() + "Z: " + _vector.getZ());
    }
    public static void outputVector3d (double _x, double _y, double _z) {
        System.out.println("X: " + _x + "Y: " + _y + "Z: " + _z);
    }
    public static void outputVector3d (Vector3d _vector) {
        System.out.println("X: " + _vector.getX() + "Y: " + _vector.getY() + "Z: " + _vector.getZ());
    }
}
