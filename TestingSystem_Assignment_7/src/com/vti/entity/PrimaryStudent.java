package com.vti.entity;

public class PrimaryStudent extends Student {
    public static int countPrimaryStudent = 0;
    public PrimaryStudent() {
        super();
    }

    public PrimaryStudent(int _id, String _name) {
        super(_id, _name);
        countPrimaryStudent++;
    }

    public static int getCountPrimaryStudent() {
        return countPrimaryStudent;
    }




}
