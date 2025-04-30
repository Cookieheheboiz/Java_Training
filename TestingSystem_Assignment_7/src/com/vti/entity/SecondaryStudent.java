package com.vti.entity;

public class SecondaryStudent extends Student {
    public static int countSecondaryStudent = 0;

    public SecondaryStudent() {
        super();
    }

    public SecondaryStudent(int _id, String _name) {
        super(_id, _name);
        countSecondaryStudent++;
    }

    public static int getCountSecondaryStudent() {
        return countSecondaryStudent;
    }

}
