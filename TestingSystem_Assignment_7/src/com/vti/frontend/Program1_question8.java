package com.vti.frontend;
import com.vti.entity.*;

public class Program1_question8 {
    public static void main(String[] args) {
        try {
            HinhTron h1 = new HinhTron(2);
            HinhTron h2 = new HinhTron(4);
            HinhTron h3 = new HinhTron(1);
            HinhTron h4 = new HinhTron(3);
            HinhChuNhat h5 = new HinhChuNhat(2, 3);
            HinhChuNhat h6 = new HinhChuNhat(5, 6);

        } catch (HinhHocException e) {
            System.out.println(e.getMessage());
        }
    }
}
