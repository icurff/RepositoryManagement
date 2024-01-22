package Database;

import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnector {

    private static Connection DbConnection = null;
    private static final String dbUrl = "jdbc:mysql://localhost:3306/repositorymanagement";
    private static final String username = "root";
    private static final String password = "admin";

    public DbConnector() {
        throw new AssertionError();
    }

    private static void initializeConnection() {
        try {
            DbConnection = DriverManager.getConnection(dbUrl, username, password);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Fail to connect database");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if (DbConnection == null) {
            initializeConnection();
        }
        return DbConnection;
    }
//
//    public static void closeConnection(Connection c) {
//        try {
//            if (c != null) {
//                c.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

}
