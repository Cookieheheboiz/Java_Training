package com.vti.entity;

public class HinhChuNhat extends HinhHoc {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double _chieuDai, double _chieuRong) throws HinhHocException {
        super();
        this.chieuDai = _chieuDai;
        this.chieuRong = _chieuRong;
    }

    public double getArea() {
        return chieuDai * chieuRong;
    }

    public double getPerimeter() {
        return 2 * (chieuDai + chieuRong);
    }
}
