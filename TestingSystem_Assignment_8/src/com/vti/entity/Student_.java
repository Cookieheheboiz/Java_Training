package com.vti.entity;

public class Student_<T> {
    private T id;
    private String name;

    public Student_(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}