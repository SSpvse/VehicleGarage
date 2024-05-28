import Parts.Engine.EngineV10;
import Parts.Engine.EngineV6;
import Parts.Engine.EngineV8;
import Parts.Engine.aEngine;
import Parts.Steering.Handlebars;
import Parts.Steering.Joystick;
import Parts.Steering.SteeringWheel;
import Parts.Steering.aSteering;
import Parts.Wheels.OffRoadWheels;
import Parts.Wheels.RaceWheels;
import Parts.Wheels.aWheels;
import Vehicles.Ground.Car;
import Vehicles.aVehicle;

import java.util.Scanner;

public class MenuFunctions {

   /* public void MainMenuSwitch() {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("1: View Players 2: Buy Players 3: Sell Players");

        // String userInput = scanner.nextLine();
        int userInput = scanner.nextInt();
        if (0 < userInput && userInput < 5) {
            switch (userInput) {
                case 1:
                    run2_1 = true;
                case 2:
                    run2_2 = true;
                case 3:
                    run2_3 = true;
                case 4:
                    break mainMenu;
            }
        } else {
            System.out.println("You only have 1-4 options");
        }

        scanner.close();
        return 0;
    }

    */

    public aVehicle BuyCar() {
        Scanner scanner = new Scanner(System.in);
        aEngine myEng = null;
        aSteering mySteer = null;
        aWheels myWheel = null;

        System.out.println("Choose your engine: \n1:V6\n2:V8\n3:V10 \n4: Exit");
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                myEng = new EngineV6();
                break;
            case 2:
                myEng = new EngineV8();
                break;
            case 3:
                myEng = new EngineV10();
                break;
            case 4:
                return null;
        }
        System.out.println("Choose your steering: \n1: Wheel \n2: Joystick \n3: Handlebars \n4: Exit");

        userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                mySteer = new SteeringWheel();
                break;
            case 2:
                mySteer = new Joystick();
                break;
            case 3:
                mySteer = new Handlebars();

        }
        System.out.println("Choose your wheels: \n1: Racer Wheels \n2: Off Road \n3: Exit");

        userInput = scanner.nextInt();
        scanner.nextLine();
        switch (userInput) {
            case 1:
                myWheel = new RaceWheels();
                break;
            case 2:
                myWheel = new OffRoadWheels();
                break;
        }

        System.out.println("Give your vehicle a name: \n");
        String inputName = scanner.nextLine();
        aVehicle myCar = new Car(inputName, myWheel, myEng, mySteer);

        return myCar;
    }
}
