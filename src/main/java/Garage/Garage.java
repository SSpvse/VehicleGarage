package Garage;

import Vehicles.aVehicle;

import java.util.ArrayList;

public class Garage {

    int nrOfVehicles;

    ArrayList<aVehicle> garageList = new ArrayList<aVehicle>();

    public Garage() {

    }


    //Methods ==v

    public void showAllVehicles() {
        for (aVehicle v : garageList) {
            System.out.println(v.toString());
        }
    }

    public void deleteById(int id) {
        System.out.println("Enter vehicles ID: \n");
        for (aVehicle v : garageList) {
            if (v.getVehicleID() == id) {
                System.out.println("Removed vehicle: \n" + v.toString());
                garageList.remove(v);
                System.out.println("Did not find vehicle with id = " + id);
            }
        }
    }


    public aVehicle searchByName(String name) {

        for (aVehicle veh : garageList) {
            if (veh.getVehicleName().equalsIgnoreCase(name)) {
                return veh;
            }
        }
        return null;
    }

    public void deleteByName(String name) {
        aVehicle aVeh = searchByName(name);
        garageList.remove(aVeh);
    }
    public void addVehicle(aVehicle vehicle) {
        garageList.add(vehicle);
    }

    public void removeVehicle(aVehicle vehicle) {
        for (aVehicle v : garageList) {
            if (v.equals(vehicle)) {
                garageList.remove(v);
            }
        }
    }

    public void storeListOfVehicles(ArrayList<aVehicle> list) {
        for (aVehicle vehicle : list) {
            garageList.add(vehicle);
        }
    }

}
