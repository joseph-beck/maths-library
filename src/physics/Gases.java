package physics;

public class Gases {
    /*
        Pressure in pa (pascals)
        Volume in m^3
        Temperature in K (kelvin)
     */

    public static double gasVolumeMolecules (double _pressure, double _temperature, double _molecules) {
        // pV = NkT
        // V = NkT / p

        return (_molecules * Constants.getBoltzmannConstant() * _temperature) / _pressure;
    }

    public static double gasVolumeMoles (double _pressure, double _temperature, double _moles) {
        // pV = nRT
        // V = nRT / p

        return (_moles * Constants.getGasConstant() * _temperature) / _pressure;
    }

    public static double gasPressureMolecules (double _volume, double _temperature, double _molecules) {
        // pV = NkT
        // p = NkT / V

        return (_molecules * Constants.getBoltzmannConstant() * _temperature) / _volume;
    }

    public static double gasPressureMoles (double _volume, double _temperature, double _moles) {
        // pV = nRT
        // p = nRT / V

        return (_moles * Constants.getGasConstant() * _temperature) / _volume;
    }

    public static float gasVolumeMolecules (float _pressure, float _temperature, float _molecules) {
        // pV = NkT
        // V = NkT / p

        return (_molecules * (float) Constants.getBoltzmannConstant() * _temperature) / _pressure;
    }

    public static double gasVolumeMoles (float _pressure, float _temperature, float _moles) {
        // pV = nRT
        // V = nRT / p

        return (_moles * Constants.getGasConstant() * _temperature) / _pressure;
    }

    public static float gasPressureMolecules (float _volume, float _temperature, float _molecules) {
        // pV = NkT
        // p = NkT / V

        return (_molecules * (float) Constants.getBoltzmannConstant() * _temperature) / _volume;
    }

    public static float gasPressureMoles (float _volume, float _temperature, float _moles) {
        // pV = nRT
        // p = nRT / V

        return (_moles * (float) Constants.getGasConstant() * _temperature) / _volume;
    }
}
