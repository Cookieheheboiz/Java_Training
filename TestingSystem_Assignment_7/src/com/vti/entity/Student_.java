package com.vti.entity;

public class Student_ {
    private int id;
    private String name;

    public Student_() {}

    public Student_(int _id, String _name) {
        this.id = _id;
        this.name = _name;
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
}
