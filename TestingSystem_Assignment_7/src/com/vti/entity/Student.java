package com.vti.entity;

public class Student {
    private int id;
    private String name;
    public static String college = "Dai hoc Bach Khoa";
    public static int moneyGroup = 0;
    public static int count = 0;

    public Student() {}

    public Student(int _id, String _name) {
        if (count >= 7) {
            throw new RuntimeException("Max student count is 7");
        }
        this.id = _id;
        this.name = _name;
        count++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /// question 4

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }
}
