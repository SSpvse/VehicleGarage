package Garage;

import Vehicles.aVehicle;

import java.util.Scanner;

public class GarageMenu {



    public void runGarageMenu(Scanner scanner, Garage g) {



        Garage garage = g;

        aVehicle vehicle;

        int input;
        do {
            System.out.println("1: View all vehicles\n2: Search by name\n3: Sell Vehicle(delete)\n4: Exit Garage Menu");
            input = scanner.nextInt();

            switch (input) {
                case 1: garage.showAllVehicles();
                    break;
                case 2:
                    System.out.println("Type in the name of vehicle:");
                    scanner.nextLine();
                    String nameInput = scanner.nextLine();
                    vehicle = garage.searchByName(nameInput);
                    System.out.println(vehicle.toString());
                    break;
                case 3:
                    System.out.println("Delete vehicle by id:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    garage.deleteById(id);
                    break;
                case 4:
                    System.out.println("Returning to menu");
                    break;
            }


        } while (input>0 && input<5);
    }
}
