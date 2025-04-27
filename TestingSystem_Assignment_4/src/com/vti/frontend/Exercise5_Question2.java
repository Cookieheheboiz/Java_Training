package com.vti.frontend;
import com.vti.backend.QuanLyCanBo;

import java.util.Scanner;

public class Exercise5_Question2 {
    public static void main(String[] args) {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Them can bo");
            System.out.println("2. Tim can bo");
            System.out.println("3. Hien thi danh sach can bo");
            System.out.println("4. Xoa can bo");
            System.out.println("5. Thoat");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    quanLyCanBo.addCanBo();
                    break;
                case 2:
                    quanLyCanBo.searchCanBo();
                    break;
                case 3:
                    quanLyCanBo.showCanBo();
                    break;
                case 4:
                    quanLyCanBo.deleteCanBo();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh");
                    return;
            }

        }

    }
}
