package com.vti.frontend;

import com.vti.backend.presentationlayer.AccountController;
import com.vti.entity.Account;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        try {
            AccountController accountController = new AccountController();
            List<Account> accounts = accountController.getListAccount();
            for (Account account : accounts) {
                System.out.println(account);
            }
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
}
