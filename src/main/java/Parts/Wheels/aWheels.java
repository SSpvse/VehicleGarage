package Parts.Wheels;

import Parts.aParts;
import Parts.iVehiclePart;

public abstract class aWheels extends aParts {


    public String partName;
    public aWheels(String name) {
        super(name);
        this.partName = name;
    }

    public void MakeSound() {
        System.out.println("Sqeeel ");
    }

    @Override
    public void TestPart() {
        System.out.println("Tyre pressure is good!");
    }

    @Override
    public String getPartName() {
        System.out.println("Part name: "+partName);
        return partName;
    }
}
