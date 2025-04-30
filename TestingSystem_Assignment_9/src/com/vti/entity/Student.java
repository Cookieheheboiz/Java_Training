package com.vti.entity;

public class Student {
    private static int autoCount = 0;
    private int id;
    private String name;

    public Student(String name) {
        this.name = name;
        this.id = ++autoCount;
    }

    @Deprecated
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLatestId() {
        return "MSV: " + id;
    }
}
