package com.vti.backend;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.vti.entity.Group;


public class Exercise1 {
        private List<Group> groups = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        public void question1() {
            System.out.println("Nhập chuỗi: ");
            String str = input.nextLine();
            int count  = 0;
            boolean check = false;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c != ' ') {
                    if (!check) {
                        count++;
                        check = true;
                    }
                } else check = false;
            }
            System.out.println("So tu trong chuoi la: " + count);
        }

        public void question2() {
            System.out.print("Nhap chuoi s1: ");
            String s1 = input.nextLine();
            System.out.println("");
            System.out.print("Nhap chuoi s2: ");
            String s2 = input.nextLine();
            String result = s1 + s2;
            System.out.println("result: " + result);

        }

        public void question3() {
            System.out.print("Nhap ten: ");
            String name = input.nextLine();
            String[] arr = name.split("\\s+");  /// \\s+ nhieu khoang trang lien tiep nhau
            StringBuilder result = new StringBuilder();
            for (String s : arr) {
                result.append((s.substring(0, 1).toUpperCase())).append(s.substring(1).toLowerCase()).append(" ");
            }
            System.out.println(result.toString());
        }

        public void question4() {
            System.out.print("Nhap ten: ");
            String name = input.nextLine();
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                System.out.println("Ki tu thu " + (i + 1) + " la: " + c);
            }
        }

        public void question5() {
            System.out.print("nhap ho: ");
            String firstName = input.nextLine();
            System.out.print("hay nhap ten: ");
            String lastName = input.nextLine();
            System.out.println("Ho va ten: " + firstName + " " + lastName);
        }

        public void question6() {
            System.out.print("nhap ho va ten: ");
            String fullName = input.nextLine();
            String[] arr = fullName.split("\\s+");
            String firstName = arr[0];
            String lastName = arr[arr.length - 1];
            StringBuilder middleName = new StringBuilder();
            for (int i = 1; i < arr.length - 1; i++) {
                middleName.append(arr[i]).append(" ");
            }
            System.out.println("Ho la: " + firstName);
            System.out.println("Ten dem la: " + middleName.toString());
            System.out.println("Ten la: " + lastName);
        }

        public void question7() {
            System.out.print("Nhap ten: ");
            String name = input.nextLine();
            name = name.trim().replaceAll("\\s+", " ");
            String[] arr = name.split("\\s+");
            StringBuilder result = new StringBuilder();
            for (String s : arr) {
                result.append((s.substring(0, 1).toUpperCase())).append(s.substring(1).toLowerCase()).append(" ");
            }
            System.out.println(result.toString().trim());
        }

        public void question8() {
            for (Group group: groups) {
                if (group.getGroupName().toLowerCase().contains("java")) {
                    System.out.println(group.getGroupName());
                }
            }
        }

        public void question9() {
            for (Group group: groups) {
                if (group.getGroupName().toLowerCase().equalsIgnoreCase("java")) {
                    System.out.println(group.getGroupName());
                }
            }
        }
}
