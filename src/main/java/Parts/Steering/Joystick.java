package Parts.Steering;

public class Joystick extends aSteering {

    public Joystick() {
        super("Joystick");
    }

    public void TestPart() {
        System.out.println("Moving the stick around, works good!");
    }


    public void GoRight() {
        System.out.println("Turning wheel to right!");
    }
    public void GoLeft() {
        System.out.println("Turning wheel to left!");
    }
    public String getPartName() {
        return this.partName;
    }
}
