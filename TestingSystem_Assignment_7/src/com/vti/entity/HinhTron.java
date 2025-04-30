package com.vti.entity;

public class HinhTron extends HinhHoc {
    private double banKinh;

    public HinhTron(double _banKinh) throws HinhHocException {
        super();
        this.banKinh = _banKinh;
    }

    public double getArea() {
        return Math.PI * Math.pow(banKinh, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * banKinh;
    }
}
