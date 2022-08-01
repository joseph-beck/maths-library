package physics;

public class gases {
    /*
        Pressure in pa (pascals)
        Volume in m^3
        Temperature in K (kelvin)
     */

    public static double gasVolumeMolecules (double _pressure, double _temperature, double _molecules) {
        // pV = NkT
        // V = NkT / p

        return (_molecules * constants.getBoltzmannConstant() * _temperature) / _pressure;
    }

    public static double gasVolumeMoles (double _pressure, double _temperature, double _moles) {
        // pV = nRT
        // V = nRT / p

        return (_moles * constants.getGasConstant() * _temperature) / _pressure;
    }

    public static double gasPressureMolecules (double _volume, double _temperature, double _molecules) {
        // pV = NkT
        // p = NkT / V

        return (_molecules * constants.getBoltzmannConstant() * _temperature) / _volume;
    }

    public static double gasPressureMoles (double _volume, double _temperature, double _moles) {
        // pV = nRT
        // p = nRT / V

        return (_moles * constants.getGasConstant() * _temperature) / _volume;
    }
}
