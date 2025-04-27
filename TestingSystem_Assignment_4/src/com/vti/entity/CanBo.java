package com.vti.entity;

public class CanBo {
    private String name;
    private int age;
    private String gender;
    private String address;

    public CanBo() {}

    public CanBo(String _name, int _age, String _gender, String _address) {
        this.name = _name;
        this.age = _age;
        this.gender = _gender;
        this.address = _address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
