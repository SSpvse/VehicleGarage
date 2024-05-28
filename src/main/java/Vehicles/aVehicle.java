package Vehicles;

import Parts.Engine.EngineV8;
import Parts.Engine.aEngine;
import Parts.Steering.aSteering;

public abstract class aVehicle implements iVehicle {




    public int vehicleID;



    protected String vehicleName;
   // protected String makeOfVehicle;
    aEngine engine;
    aSteering steering;

    //Constructors ==v
    public aVehicle() {
        ++vehicleID;
    }

    public aVehicle(aEngine eng) {
        ++vehicleID;
        this.engine = eng;
    }
    public aVehicle( String name , aEngine eng, aSteering steer ) {
        ++vehicleID;
        this.vehicleName = name;
        this.engine = eng;
        this.steering = steer;
    }


    //Methods ==v

    public void EngineStart(){
        engine.StartEngine();
    }
    public void EngineOff(){
        engine.EngineOff();
    };
    public void Accelerate(){
        if (engine.isEngineON() == true) {
            System.out.println("Accelerating the vehicle! ");
        }
    };
    public void Break(){
        System.out.println("Breaking! ");
    };



    public String toString() {
        return "Vehicle: \n" +
                "vehicleID = " + vehicleID +
                "\nvehicleName = " + vehicleName +
                "\nengine = " + engine.getPartName() +
                "\nsteering = " + steering.getPartName() +
                '\n';
    }

    public int getVehicleID() {
        return vehicleID;
    }
    public String getVehicleName() {
        return vehicleName;
    }

    public aEngine getEngine() {
        return engine;
    }

    public aSteering getSteering() {
        return steering;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
