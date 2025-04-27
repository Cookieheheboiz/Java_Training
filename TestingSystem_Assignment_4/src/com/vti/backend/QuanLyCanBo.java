package com.vti.backend;
import com.vti.entity.CanBo;
import com.vti.entity.CongNhan;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    private List<CanBo> listCanBo = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    public void addCanBo() {
        System.out.println("Nhap loai can bo: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();

        switch (option) {
            case 1:
                System.out.print("Nhap bac: ");
                int level = scanner.nextInt();
                scanner.nextLine();
                listCanBo.add(new CongNhan(name, age, gender, address, level));
                break;

            case 2:
                System.out.print("Nhap nganh dao tao: ");
                String nganhDaoTao = scanner.nextLine();
                listCanBo.add(new KySu(name, age, gender, address, nganhDaoTao));
                break;

            case 3:
                System.out.println("Nhap cong viec: ");
                String job = scanner.nextLine();
                listCanBo.add(new NhanVien(name, age, gender, address, job));
        }
    }


    public void searchCanBo() {
        System.out.println("Nhap ten can tim: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (CanBo canBo : listCanBo) {
            if (canBo.getName().equalsIgnoreCase(name)) {
                System.out.println(canBo.getName());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ten nguoi do");
        }
    }

    public void showCanBo() {
        for (CanBo canBo : listCanBo) {
            System.out.println(canBo.getName());
        }
    }

    public void deleteCanBo() {
        System.out.println("Nhap ten can xoa: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < listCanBo.size(); i++) {
            if (listCanBo.get(i).getName().equalsIgnoreCase(name)) {
                listCanBo.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ten nguoi do");
        }
    }
}
