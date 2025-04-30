package com.vti.frontend;

import java.sql.Connection;
import com.vti.backend.ConnectDatabase;
public class Program1 {
    public static void main(String[] args) {
        try (Connection connect = ConnectDatabase.getConnection()) {
            System.out.println("Connect success!");
            ConnectDatabase connectDatabase = new ConnectDatabase();
            connectDatabase.getPositionInfo();
            connectDatabase.createPosition("Dev");
            connectDatabase.updatePosition();
            connectDatabase.deletePosition(10);
        } catch (Exception e) {
            System.out.println("Connect failed!" + e.getMessage());
        }
    }
}
/// da lam den exercise 2


