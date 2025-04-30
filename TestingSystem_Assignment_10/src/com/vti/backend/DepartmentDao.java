package com.vti.backend;

import com.vti.entity.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDao {
    public static Connection databaselink;
    public DepartmentDao() throws Exception {
        databaselink = ConnectDatabase.getConnection();
    }

    public List<Department> getDepartment() throws Exception {
        List<Department> departments = new ArrayList<>();
        String text = "SELECT * FROM Department";
        try (Connection connection = ConnectDatabase.getConnection()) {
            Statement statement1 = databaselink.createStatement();
            statement1.executeQuery(text);
            while (statement1.getResultSet().next()) {
                int id = statement1.getResultSet().getInt("DepartmentID");
                String name = statement1.getResultSet().getString("DepartmentName");
                departments.add(new Department(id, name));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return departments;

    }


    public void getDepartmentByID(int id) throws Exception {
        String text = "SELECT * FROM Department WHERE DepartmentID = ?";
        try (Connection connection = ConnectDatabase.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(text);
            statement.setInt(1, id);
            if (statement.executeQuery().next()) {
                int departmentID = statement.getResultSet().getInt("DepartmentID");
                String departmentName = statement.getResultSet().getString("DepartmentName");
                System.out.println("DepartmentID: " + departmentID + ", DepartmentName: " + departmentName);
            } else {
                System.out.println("Cannot find department");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public boolean isDepartmentNameExists(String name) throws Exception {
        String text = "SELECT * FROM Department WHERE DepartmentName = ?";
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

    public boolean isDepartmentIDExists(int id) throws Exception {
        String text = "SELECT * FROM Department WHERE DepartmentID = ?";
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




    public void createDepartment(String name) throws Exception {
        String text = "INSERT INTO Department(DepartmentName) VALUES (?)";
        try (Connection connection = ConnectDatabase.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(text);
            statement.setString(1, name);
            if (statement.executeUpdate() > 0) {
                System.out.println("Insert success!");
            } else {
                System.out.println("Insert failed!");
            }
        }
    }

    public void updateDepartment(int id, String name) throws Exception {
        String text = "UPDATE Department SET DepartmentName = ? WHERE DepartmentID = ?";

        if (!isDepartmentIDExists(id)) {
            throw new Exception("Cannot find department which has id = " + id);
        }


        if (isDepartmentNameExists(name)) {
            throw new Exception("Department Name is Exists!");
        }

        try (Connection connection = ConnectDatabase.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(text);
            statement.setString(1, name);
            statement.setInt(2, id);
            if (statement.executeUpdate() > 0) {
                System.out.println("Update success!");
            } else {
                System.out.println("Update failed!");
            }
        }
    }


    public void deleteDepartment(int id) throws Exception {
        String text = "DELETE FROM Department WHERE DepartmentID = ?";
        if (!isDepartmentIDExists(id)) {
            throw new Exception("Cannot find department which has id = " + id);
        }
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

}
