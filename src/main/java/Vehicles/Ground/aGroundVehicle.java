package Vehicles.Ground;

import Parts.Engine.aEngine;
import Parts.Steering.aSteering;
import Parts.Wheels.aWheels;
import Vehicles.aVehicle;

public abstract class aGroundVehicle extends aVehicle {



    aEngine engine;
    aWheels wheels;
    aSteering steering;

    //Constructors ==v

    public aGroundVehicle() {}

    public aGroundVehicle(aEngine eng) {
        super(eng);
        this.engine = eng;
    }
    public aGroundVehicle(String name, aWheels wheel, aEngine eng, aSteering steer ) {
        super(name, eng, steer);
        this.engine = eng;
        this.wheels = wheel;
        this.steering = steer;
    }


    //Methods ==v

    public void EngineStart(){
        engine.StartEngine();
        System.out.println(this.vehicleID);

    }
    public void EngineOff(){
        engine.EngineOff();
    };
    public void Accelerate(){
        System.out.println("Accelerating the vehicle! ");
    };
    public void Break(){
        System.out.println("Breaking! ");
    };



}
