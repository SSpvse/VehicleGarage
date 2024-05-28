package Parts.Engine;

import Parts.aParts;
import Parts.iVehiclePart;

public abstract class aEngine extends aParts {


    String makeOfEngine;
    int horsePower;
    int cylinderCount;
    protected boolean engineON = false;

    public aEngine() {
        super("Engine");
    }

    public aEngine(String make, int hp, int cyl) {
        super("Engine");
        this.makeOfEngine = make;
        this.horsePower = hp;
        this.cylinderCount = cyl;
    }


    public void MakeSound() {
        System.out.println("ENGINE SOUND, VRUUMM!");
    }

    public void StartEngine() {
        engineON = true;
        System.out.println(horsePower + " horsepower, V" + cylinderCount + " " + makeOfEngine + " engine turned on ! ");
    }

    public void EngineOff() {
        engineON = false;
        System.out.println(makeOfEngine + " V" + cylinderCount + " engine shut off!");
    }

    // ABSTRACT METHOD


    // IMPLEMENTATIONS FROM INTERFACE
    public void TestPart() {
        StartEngine();
        MakeSound();
        EngineOff();
        System.out.println("Looks good after inspection!");
    }

   /* public String getPartName() {
        System.out.println("Part name: " + partName);
        return partName;
    }*/

    public String getMakeOfEngine() {
        return makeOfEngine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public boolean isEngineON() {
        return engineON;
    }
}
