package com.vti.entity;
import com.vti.backend.ScannerUtils;
public class Department {
    private int departmentID;
    private String departmentName;

    public Department() {
        System.out.print("enter DepartmentID: ");
        this.departmentID = ScannerUtils.inputInt("Wrong inputing! Please input a number as int, input again.");

        System.out.print("enter DepartmentName: ");
        this.departmentName = ScannerUtils.inputString();
    }

    public Department(int departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
