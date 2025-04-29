package com.vti.entity;

import com.vti.backend.ScannerUtils;

public class Position {
    private int positionID;
    private String positionName;

    public Position() {
        System.out.print("enter PositionID: ");
        this.positionID = ScannerUtils.inputInt("Wrong inputing! Please input a number as int, input again.");

        System.out.print("enter PositionName: ");
        this.positionName = ScannerUtils.inputString();

    }

    public Position(int positionID, String positionName) {
        this.positionID = positionID;
        this.positionName = positionName;
    }

    public int getPositionID() {
        return positionID;
    }

    public void setPositionID(int positionID) {
        this.positionID = positionID;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
