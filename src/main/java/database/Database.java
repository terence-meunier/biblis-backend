package database;

import java.sql.*;

public class Database {
    private static String dbName = "dbName";
    private static String user = "user";
    private static String pass = "mp";
    private static String host = "localhost";
    private static int port = 3306;
    private static String driver = "mysql";
    private static Connection connector = null;
    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet result = null;

    private static Connection getDB() {
        if (connector == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.err.println(e);
            }

            try {
                String url = "jdbc:" + driver + "://" + host + ":" + port + "/" + dbName;
                connector = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return connector;
    }

    public static ResultSet query(String query) throws SQLException {
        statement = getDB().createStatement();
        return statement.executeQuery(query);
    }

    public static void close() {

        // Libération de la ressource result
        if (result != null) {
            try {
                result.close();
                result = null;
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

        // Libération de la ressource preparedStatement
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
                preparedStatement = null;
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

        // Libération de la ressource statement
        if (statement != null) {
            try {
                statement.close();
                statement = null;
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

        // Libération de la ressource connector
        if (connector != null) {
            try {
                connector.close();
                connector = null;
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
