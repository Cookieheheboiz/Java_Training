package com.vti.entity;
import java.time.LocalDate;

public class Account {
    private int accountID;
    private String email;
    private String username;
    private String fullname;
    private Department departmentID;
    private Position positionID;
    private LocalDate createDate;

    public Account() {}

    public Account(int accountID, String email, String username, String fullname, Department departmentID, Position positionID, LocalDate createDate) {
        this.accountID = accountID;
        this.email = email;
        this.username = username;
        this.fullname = fullname;
        this.departmentID = departmentID;
        this.positionID = positionID;
        this.createDate = createDate;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Department getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Department departmentID) {
        this.departmentID = departmentID;
    }

    public Position getPositionID() {
        return positionID;
    }

    public void setPositionID(Position positionID) {
        this.positionID = positionID;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
