package com.vti.entity;

public abstract class HinhHoc {
    public static int count = 0;
    public HinhHoc() throws HinhHocException {
        if (count >= Configs.SO_LUONG_HINH_TOI_DA) {
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
        }
        count++;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
