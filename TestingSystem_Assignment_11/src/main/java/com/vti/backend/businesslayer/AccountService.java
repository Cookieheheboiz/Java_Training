package com.vti.backend.businesslayer;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.backend.datalayer.IAccountRepository;
import com.vti.entity.Account;

import java.util.List;

public class AccountService implements IAccountService {
    private IAccountRepository iAccountRepository;

    public AccountService() throws Exception {
        iAccountRepository = new AccountRepository();
    }
    public List<Account> getListAccount() throws Exception {
        return iAccountRepository.getListAccount();
    }
    public void getAccountByID(int id) throws Exception {
        iAccountRepository.getAccountByID(id);
    }

    public boolean isAccountExists(String username) throws Exception {
        return iAccountRepository.isAccountExists(username);
    }
    public boolean isAccountExists(int id) throws Exception {
        return iAccountRepository.isAccountExists(id);
    }

    public void createAccount(String email, String username, String Fullname, int DepartmentID, int PositionID) throws Exception {
        if (isAccountExists(username)) {
            throw new Exception("Username already exists");
        }
        iAccountRepository.createAccount(email, username, Fullname, DepartmentID, PositionID);

    }
    public void updateAccount(int id, String username) throws Exception {
        if (!isAccountExists(id)) {
            throw new Exception("Account does not exist");
        }
        if (isAccountExists(username)) {
            throw new Exception("Username already exists");
        }
        iAccountRepository.updateAccount(id, username);
    }
    public void deleteAccount(int id) throws Exception {
        if (!isAccountExists(id)) {
            throw new Exception("Account does not exist");
        }
        iAccountRepository.deleteAccount(id);
    }



}
