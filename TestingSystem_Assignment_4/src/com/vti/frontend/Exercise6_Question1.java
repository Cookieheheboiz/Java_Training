package com.vti.frontend;
import com.vti.entity.Phone;
import com.vti.entity.VietnamesePhone;

import java.util.Scanner;
public class Exercise6_Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VietnamesePhone phone = new VietnamesePhone();
        phone.insertContact("huy", "05345678424");
        phone.searchContact("huy");
        while (true) {
            System.out.println("1. Them lien lac");
            System.out.println("2. Xoa lien lac");
            System.out.println("3. Update lien lac");
            System.out.println("4. Tim lien lac");
            System.out.println("5. Thoat");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Nhap ten: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap so dien thoai: ");
                    String phoneNumber = scanner.nextLine();
                    phone.insertContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Nhap ten: ");
                    String removeName = scanner.nextLine();
                    phone.removeContact(removeName);
                    break;
                case 3:
                    System.out.print("Nhap ten: ");
                    String name1 = scanner.nextLine();
                    System.out.print("Nhap so dien thoai: ");
                    String newPhoneNumber = scanner.nextLine();
                    phone.updateContact(name1, newPhoneNumber);
                    break;
                case 4:
                    System.out.print("Nhap ten: ");
                    String name2 = scanner.nextLine();
                    phone.searchContact(name2);
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh");
                    return;
            }

        }
    }
}
