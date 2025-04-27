package com.vti.entity;

public class CongNhan extends CanBo {
    private int level;

    public CongNhan(String _name, int _age, String _gender, String _address, int _level) {
        super(_name, _age, _gender, _address);
        this.level = _level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
