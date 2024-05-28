import Garage.*;
import Vehicles.Ground.Car;
import Vehicles.aVehicle;
import db.VehicleService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


    VehicleService vs = new VehicleService();
    Garage garage = new Garage();
    GarageMenu garageMenu = new GarageMenu();
    MenuFunctions menuFunctions = new MenuFunctions();

    Scanner scanner = new Scanner(System.in);


    ArrayList<aVehicle> tempList = new ArrayList<>();
    public void RunMenu() throws SQLException {
        int input;
        do {
            System.out.println("1: View Your Garage\n2: Buy Vehicles \n3: Sell Vehicles\n4: Sell by name\n5: Exit\n 6 Get vehicles");
            input = scanner.nextInt();
            switch (input){
                case 1:
                   //  garage.showAllVehicles();
                    garageMenu.runGarageMenu(scanner, garage);
                    break;
                case 2:
                    aVehicle myVeh = menuFunctions.BuyCar();
                    vs.addVehicle(myVeh.getVehicleName());
                    garage.addVehicle(myVeh);
                    break;
                case 3:
                    System.out.println("Enter cars ID, to delete:\n");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    garage.deleteById(input);
                    break;
                case 4:
                    System.out.println("Enter cars name, to delete:\n");
                    String sInput = scanner.nextLine();
                    garage.deleteByName(sInput);
                    break;
                case 5:
                    System.out.println("Exiting");
                    break;
                case 6:
                    tempList = vs.getAllVehicles();
                    for(aVehicle car: tempList){
                        System.out.println(car.getVehicleName());
                    }
                break;
            }
        } while (input < 7 && input > 0 && input != 5);


        /*
        boolean run1 = true;
        mainMenu:while (run1) {
            boolean run2_1 = false, run2_2 = false, run2_3 = false;

            System.out.println("1: View Your Garage.Garage 2: Buy Vehicles 3: Sell Vehicles, 4: Exit");

            // System.out.println("1: View Players 2: Buy Players 3: Sell Players");

            // String userInput = scanner.nextLine();
            int userInput = scanner.nextInt();
            if (0 < userInput && userInput < 5) {
                switch (userInput) {
                    case 1:
                        run2_1 = true;
                        break ;
                    case 2:
                        run2_2 = true;
                        break ;
                    case 3:
                        run2_3 = true;
                        break ;
                    case 4:
                        break mainMenu;
                }
            } else {
                System.out.println("You only have 1-4 options");
            }
            menuAllVehicles :while (run2_1) {
                garage.showAllVehicles();
            }
            menuBuyVehicle:while (run2_2) {
                aVehicle myVehicle = menuFunctions.BuyCar();
                garage.storeVehicle(myVehicle);
                break;
            }
            menuSellVehicle:while (run2_3) {

            }
        }

         */
    }

}
