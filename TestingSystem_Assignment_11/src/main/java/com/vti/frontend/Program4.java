package com.vti.frontend;

import com.vti.backend.presentationlayer.AccountController;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) throws Exception {
        AccountController accountController = new AccountController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Get list account");
            System.out.println("2. Get account by ID");
            System.out.println("3. Check account exists by username");
            System.out.println("4. Check account exists by ID");
            System.out.println("5. Create account");
            System.out.println("6. Update account");
            System.out.println("7. Delete account");
            System.out.println("8. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    accountController.getListAccount();
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    accountController.getAccountByID(id);
                    break;
                case 3:
                    System.out.print("Enter username: ");
                    scanner.nextLine();
                    String username = scanner.nextLine();
                    accountController.isAccountExists(username);
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    int id1 = scanner.nextInt();
                    accountController.isAccountExists(id1);
                    break;
                case 5:
                    System.out.print("Email: ");
                    scanner.nextLine();
                    String email = scanner.nextLine();
                    System.out.print("Username: ");
                    String username1 = scanner.nextLine();
                    System.out.print("Fullname: ");
                    String fullname = scanner.nextLine();
                    System.out.print("DepartmentID: ");
                    int departmentID = scanner.nextInt();
                    System.out.print("PositionID: ");
                    int positionID = scanner.nextInt();
                    accountController.createAccount(email, username1, fullname, departmentID, positionID);
                    break;
                case 6:
                    System.out.print("Enter ID: ");
                    int updateID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new username: ");
                    String updateUsername = scanner.nextLine();
                    accountController.updateAccount(updateID, updateUsername);
                    break;
                case 7:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    accountController.deleteAccount(deleteId);
                    break;
                case 8:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Please choose a number from 1 to 8");
            }

        }
    }
}
