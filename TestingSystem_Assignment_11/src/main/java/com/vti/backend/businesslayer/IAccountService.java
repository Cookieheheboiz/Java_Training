package com.vti.backend.businesslayer;

import com.vti.entity.Account;

import java.util.List;

public interface IAccountService {
    List<Account> getListAccount() throws Exception;
    void getAccountByID(int id) throws Exception;
    void createAccount(String email, String username, String Fullname, int DepartmentID, int PositionID) throws Exception;
    void updateAccount(int id, String username) throws Exception;
    void deleteAccount(int id) throws Exception;
    boolean isAccountExists(String username) throws Exception;
    boolean isAccountExists(int id) throws Exception;

}
