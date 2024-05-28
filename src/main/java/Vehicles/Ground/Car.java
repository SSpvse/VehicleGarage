package Vehicles.Ground;

import Parts.Engine.aEngine;
import Parts.Steering.aSteering;
import Parts.Wheels.aWheels;

public class Car extends aGroundVehicle {

    aWheels wheels;
    aEngine engine;
    aSteering steering;


    //Constructors ==v
    public Car() {
        super();
    }

    public Car(aEngine engine) {
        super(engine);
        // this.engine = engine;
    }
    public Car(String name ,aWheels wheel, aEngine eng, aSteering steer) {
        super(name, wheel, eng, steer);
    }

    //Methods ==v



    public void ShowID() {
        System.out.println("ID" + vehicleID);
    }



    public void GetVehicleName() {}
}
