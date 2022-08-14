import math.*;
import statistics.*;
import outputs.*;
import sorters.*;
import matrices.*;
import vectors.*;

public class main  {
    public static void main(String[] args) {
        vector2f vector1 = new vector2f(1, 2);

        vector2f vector2 = new vector2f(3, 4);


        System.out.println("Resolved: " + vector2.resolveVector2f());
        vector1 = vector1.addVector2f(vector2);
        System.out.println("Vector: ");
        vectors.outputVector2f(vector1);
    }
}
