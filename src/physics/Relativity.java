package physics;
import maths.*;

public class Relativity {
    public double energy (double _mass) {
        // E = mc^2

        return _mass * Operations.square(Constants.getSpeedOfLight());
    }

    public double mass (double _energy) {
        // m = E / c^2

        return _energy / Operations.square(Constants.getSpeedOfLight());
    }


}
