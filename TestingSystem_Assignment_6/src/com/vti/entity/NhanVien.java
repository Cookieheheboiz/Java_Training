package com.vti.entity;

public class NhanVien extends CanBo {
    private String job;

    public NhanVien(String _name, int _age, String _gender, String _address, String _job) {
        super(_name, _age, _gender, _address);
        this.job = _job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
