package Parts.Steering;

public class SteeringWheel extends aSteering {


    public SteeringWheel() {
        super("SteeringWheel");
    }

    public void TestPart() {
        System.out.println("Testing wheel to right and left, works fine!");
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
