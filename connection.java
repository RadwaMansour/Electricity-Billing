/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminmodule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ALMASA
 */
class connection {

    public static Connection getconnection() throws SQLException {
        String URL = "jdbc:sqlserver://localhost\\DESKTOP-A1088VT\\SQLEXPRESS:1433;databaseName=Electricbills";
        String Name = "sa";
        String Password = "123";
        Connection connectDB = DriverManager.getConnection(URL, Name, Password);
        System.out.println("Connection is successfull");

        return connectDB;
    }
}
