package Parts.Steering;

import Parts.aParts;
import Parts.iVehiclePart;

abstract public class aSteering extends aParts {


    protected String partName;

    public aSteering(String name) {
        super(name);
        this.partName = name;
    }

    //Methods ==v
    abstract void GoRight();

    abstract void GoLeft();


}
