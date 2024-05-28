package Parts.Engine;

import java.lang.reflect.Constructor;

public class EngineV6 extends aEngine {

    /*String makeOfEngine = "BMW";
    int horsePower = 360;
    int cylinderCount = 6;
    */

    public EngineV6() {
        super("BMW", 360, 6);
    }

    public void StartEngine() {
        System.out.println(horsePower+ " horsepower, V"+cylinderCount +" "+ makeOfEngine + " engine turned on ! ");
    }
    public void EngineOff() {
        System.out.println(makeOfEngine+" engine shut off!");
    }
}
