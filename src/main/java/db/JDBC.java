/* package db;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {


    private final MysqlDataSource vehicleDS;
    public JDBC() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {

        // Set your user and password to connect to your database


        try (vehicleDS = new MysqlDataSource()){

            veh
                    PropertiesProvider.PROPS.getProperty("host");
                    //"jdbc:mysql://127.0.0.1:3306/vehicleDB?useSSL=false",
                    // "root",
                    PropertiesProvider.PROPS.get("db_name");
                    PropertiesProvider.PROPS.get("port");
                    PropertiesProvider.PROPS.get("uname");
                    PropertiesProvider.PROPS.get("pwd");

            return connection;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }

    public void closeConnection(Connection connection) {
        try{
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


 */