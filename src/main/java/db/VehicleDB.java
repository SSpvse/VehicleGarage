/*package db;

import Vehicles.aVehicle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VehicleDB extends JDBC {

    public ArrayList<aVehicle> library;

    public VehicleDB() {
        library = new ArrayList<>();
    }

    public ArrayList<aVehicle> getVehicle() {

        try (Connection connection = getConnection()) {

            Statement statement = connection.createStatement();

            // -- Cars

            String sqlQuery = "SELECT * from vehicles\n" +
                    "vehicleID = vehicle.id";

            ResultSet resultSet = statement.executeQuery(sqlQuery);



        } catch (SQLException e) {
            e.printStackTrace();
        }

        return library;
    };



}

 */
