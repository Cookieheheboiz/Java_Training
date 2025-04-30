package com.vti.backend;
import java.sql.*;

public class ConnectDatabase {
    private static Connection databaselink;
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost/company_management";
        String databaseUser = "root";
        String databasePassword = "Dangquochuy24982765@";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                databaselink = DriverManager.getConnection(url, databaseUser, databasePassword);
            } catch (Exception e) {
                e.printStackTrace();
            }

        return databaselink;
    }

    public void getPositionInfo() {
        String text = "SELECT * FROM Position";
        try (Connection connection = ConnectDatabase.getConnection()) {
            Statement statement = connection.createStatement();
            statement.executeQuery(text);
            while (statement.getResultSet().next()) {
                int id = statement.getResultSet().getInt("PositionId");
                String name = statement.getResultSet().getString("PositionName");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createPosition(String _PositionName) {
        String text = "INSERT INTO Position (PositionName) VALUES (?)";
        try (Connection connection = ConnectDatabase.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(text);
            statement.setString(1, _PositionName);
            int count = statement.executeUpdate();
            if (count > 0) {
                System.out.println("Insert success!");
            } else {
                System.out.println("Insert failed!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updatePosition() {
        String text = "UPDATE Position SET PositionName = 'Dev' WHERE PositionId = 5";
        try (Connection connection = ConnectDatabase.getConnection()) {
            Statement statement = connection.createStatement();
            int count = statement.executeUpdate(text);
            if (count > 0) {
                System.out.println("Update success!");
            } else {
                System.out.println("Update failed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePosition(int id) {
        String text = "DELETE FROM Position WHERE PositionId = ?";
        try (Connection connection = ConnectDatabase.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(text);
            statement.setInt(1, id);
            int count = statement.executeUpdate();
            if (count > 0) {
                System.out.println("Delete success!");
            } else {
                System.out.println("Delete failed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}



