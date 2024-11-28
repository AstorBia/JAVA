package Infrastrutura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConfig {

    private static String URL= "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static String USER = "RM554556";
    private static String PASS = "181085";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
