package com.vti.backend.datalayer;
import com.vti.entity.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.utils.*;

public class AccountRepository implements IAccountRepository {
    public static Connection databaselink;
    public AccountRepository() throws Exception {
        databaselink = ConnectDatabase.getConnection();
    }

    public List<Account> getListAccount() throws Exception {
        List<Account> accounts = new ArrayList<>();
        String text = "SELECT a.*, d.DepartmentName FROM Account a " +
                "JOIN Department d ON a.DepartmentID = d.DepartmentID ";
        try (Connection connection = ConnectDatabase.getConnection()) {
            Statement statement1 = databaselink.createStatement();
            statement1.executeQuery(text);
            while (statement1.getResultSet().next()) {

                int id = statement1.getResultSet().getInt("AccountID");
                String email = statement1.getResultSet().getString("Email");
                String username = statement1.getResultSet().getString("UserName");
                String name = statement1.getResultSet().getString("Fullname");
                Department department = new Department(statement1.getResultSet().getInt("DepartmentID"), statement1.getResultSet().getString("DepartmentName"));
                Position position = new Position();
                position.setPositionID(statement1.getResultSet().getInt("PositionID"));
                accounts.add(new Account(id,email, username, name, department, position, null));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return accounts;

    }

    public void getAccountByID(int id) throws Exception {
        String text = "SELECT a.*, d.DepartmentName FROM Account a " +
                "JOIN Department d ON a.DepartmentID = d.DepartmentID " +
                "WHERE AccountID = ?";
        try (Connection connection = ConnectDatabase.getConnection()) {
            PreparedStatement statement1 = connection.prepareStatement(text);
            statement1.setInt(1, id);
            if (statement1.executeQuery().next()) {
                int id1 = statement1.getResultSet().getInt("AccountID");
                String email = statement1.getResultSet().getString("Email");
                String username = statement1.getResultSet().getString("UserName");
                String name = statement1.getResultSet().getString("Fullname");
                Department department = new Department(statement1.getResultSet().getInt("DepartmentID"), statement1.getResultSet().getString("DepartmentName"));
                Position position = new Position();
                position.setPositionID(statement1.getResultSet().getInt("PositionID"));
                System.out.println("AccountID: " + id1 + ", Email: " + email + ", UserName: " + username + ", Fullname: " + name + ", DepartmentID: " + department.getDepartmentID() + "DepartmentName: " + department.getDepartmentName()  + ", PositionID: " + position.getPositionID());
            } else {
                System.out.println("Cannot find Account");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public boolean isAccountExists(int id) throws Exception {
        String text = "SELECT * FROM Account WHERE AccountID = ?";
        try (Connection connection = ConnectDatabase.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(text);
            statement.setInt(1, id);
            if (statement.executeQuery().next()) {
                return true;
            } else {
                return false;
            }
        }
    }
    public boolean isAccountExists(String name) throws Exception {
        String text = "SELECT * FROM Account WHERE username = ?";
        try (Connection connection = ConnectDatabase.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(text);
            statement.setString(1, name);
            if (statement.executeQuery().next()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void createAccount(String email, String username, String Fullname, int DepartmentID, int PositionID) throws Exception {
        if (isAccountExists(username)) {
            throw new Exception("Account already exists");
        }
        String text = "INSERT INTO Account (Email, Username, Fullname, DepartmentID, PositionID, CreateDate) VALUES (?, ?, ?, ?, ?, CURDATE())";
        try (Connection connection = ConnectDatabase.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(text);
            statement.setString(1, email);
            statement.setString(2, username);
            statement.setString(3, Fullname);
            statement.setInt(4, DepartmentID);
            statement.setInt(5, PositionID);


            if (statement.executeUpdate() > 0) {
                System.out.println("Insert success!");
            } else {
                System.out.println("Insert failed!");
            }
        }
    }

    public void deleteAccount(int id) throws Exception {
        if (!isAccountExists(id)) {
            throw new Exception("Cannot find account which has id = " + id);
        }
        String text = "DELETE FROM Account WHERE AccountID = ?";
        try (Connection connection = ConnectDatabase.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(text);
            statement.setInt(1, id);
            if (statement.executeUpdate() > 0) {
                System.out.println("Delete success!");
            } else {
                System.out.println("Delete failed!");
            }
        }
    }

    public void updateAccount(int id, String username) throws Exception {
        String text = "UPDATE Account SET Username = ? WHERE AccountID = ?";

        if (!isAccountExists(id)) {
            throw new Exception("Cannot find Account which has id = " + id);
        }

        try (Connection connection = ConnectDatabase.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(text);
            statement.setString(1, username);
            statement.setInt(2, id);
            if (statement.executeUpdate() > 0) {
                System.out.println("Update success!");
            } else {
                System.out.println("Update failed!");
            }
        }
    }

}
