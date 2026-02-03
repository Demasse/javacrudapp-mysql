package javacrudapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() throws SQLException {
       // String url = "jdbc:mysql://localhost:3306/java_crud_db";
      //  String user = "root";
       // String password = "";
       
       String url = "jdbc:postgresql://localhost:5432/java_crud_db";
        String user = "postgres";      // ou ton user PostgreSQL
        String password = "dann";

        return DriverManager.getConnection(url, user, password);
    }
}
