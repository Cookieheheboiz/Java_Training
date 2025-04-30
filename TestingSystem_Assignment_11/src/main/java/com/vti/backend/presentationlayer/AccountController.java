package com.vti.backend.presentationlayer;

import com.vti.backend.businesslayer.AccountService;
import com.vti.backend.businesslayer.IAccountService;
import com.vti.backend.datalayer.AccountRepository;
import com.vti.entity.Account;

import java.util.List;

public class AccountController implements IAccountController {
    private IAccountService iAccountService;

    public AccountController() throws Exception {
        iAccountService = new AccountService();
    }
    public List<Account> getListAccount() throws Exception {
        return iAccountService.getListAccount();
    }
    public void getAccountByID(int id) throws Exception {
        iAccountService.getAccountByID(id);
    }

    public boolean isAccountExists(String username) throws Exception {
        return iAccountService.isAccountExists(username);
    }
    public boolean isAccountExists(int id) throws Exception {
        return iAccountService.isAccountExists(id);
    }

    public void createAccount(String email, String username, String Fullname, int DepartmentID, int PositionID) throws Exception {
        if (isAccountExists(username)) {
            throw new Exception("Username already exists");
        }
        iAccountService.createAccount(email, username, Fullname, DepartmentID, PositionID);

    }
    public void updateAccount(int id, String username) throws Exception {
        iAccountService.updateAccount(id, username);
    }
    public void deleteAccount(int id) throws Exception {
        iAccountService.deleteAccount(id);
    }
}
