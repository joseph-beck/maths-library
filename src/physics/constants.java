package physics;

public class constants {
    private static final double pi = 3.14159265359;
    private static final double avogadro = 6.02252 * Math.pow(10, 23);
    private static final double speedOfLight = 2.99792458 * Math.pow(10, 8);
    private static final double plancksConstant = 6.626070040 * Math.pow(10, -34);
    private static final double boltzmannConstant = 1.38064852 * Math.pow(10, -23);
    private static final double faradayConstant = 9.648533289 * Math.pow(10, 4);
    private static final double electronRestMass = 9.10938356 * Math.pow(10, -31);
    private static final double protonRestMass = 1.672621898 * Math.pow(10, -27);
    private static final double neutronRestMass = 1.674927471 * Math.pow(10, -27);
    private static final double electronCharge = 1.6021766208 * Math.pow(10, -19);
    private static final double gasConstant = 8.31;
    private static final double earthGravity = 9.81;

    public static double getPi (){
        return pi;
    }
    public static double getAvogadro (){
        return avogadro;
    }
    public static double getSpeedOfLight (){
        return speedOfLight;
    }
    public static double getPlancksConstant (){
        return plancksConstant;
    }
    public static double getBoltzmannConstant (){
        return boltzmannConstant;
    }
    public static double getFaradayConstant (){
        return faradayConstant;
    }
    public static double getElectronRestMass (){
        return electronRestMass;
    }
    public static double getProtonRestMass (){
        return protonRestMass;
    }
    public static double getNeutronRestMass (){
        return neutronRestMass;
    }
    public static double getElectronCharge () {
        return electronCharge;
    }
    public static double getEarthGravity () {
        return earthGravity;
    }
    public static double getGasConstant () {
        return gasConstant;
    }
}
