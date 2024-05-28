import Parts.Engine.EngineV6;
import Parts.Engine.EngineV8;
import Parts.Engine.aEngine;
import Parts.Steering.SteeringWheel;
import Parts.aParts;
import Vehicles.Ground.Car;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

/*
        aEngine v6 = new EngineV6();

        v6.StartEngine();
        v6.EngineOff();
        v6.MakeSound();

        aEngine v8 = new EngineV8();
        v8.StartEngine();
        v8.EngineOff();
        v8.MakeSound();

        System.out.println("CAR::");
        Car car = new Car(v8);
        car.EngineStart();
        car.getVehicleID();

        Car car2 = new Car(v6);
        car2.ShowID();
        System.out.println("IDnr2:: "+car2.getVehicleID());
 */

        aParts eng = new EngineV6();
        aParts steer = new SteeringWheel();

        System.out.println(eng.getPartID());
        System.out.println(steer.getPartID());

        Menu menu = new Menu();

        menu.RunMenu();
    }
}