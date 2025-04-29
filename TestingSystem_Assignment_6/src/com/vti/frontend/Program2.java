package com.vti.frontend;
import com.vti.entity.Group;
import com.vti.backend.ScannerUtils;
import com.vti.entity.Account;
import java.util.Scanner;

public class Program2 {
    ///question  1 + 2
//    public static void main(String[] args) {
//        try {
//            float result = divide(7, 0);
//            System.out.println(result);
//        } catch (ArithmeticException e) {
//            System.out.println("cannot divide 0");
//        } finally {
//            System.out.println("divide completed!");
//        }
//    }
//
//    public static float divide(int a, int b) {
//        return a / b;
//    }

    /// question 3
//    public static void main(String[] args) {
//        int [] numbers = { 1, 2, 3 };
//        try {
//            System.out.println(numbers[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array index out of bounds");
//        }
//    }

    /// question 4
//    static String[] departments = {"Accounting", "Marketing", "IT"};
//
//    public static void main(String[] args) {
//        getIndex(1);
//        getIndex(3);
//    }
//
//    public static void getIndex(int index) {
//        try {
//            System.out.println("Department: " + departments[index]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Cannot find department.");
//        }
//    }

    /// question 5
//    public static int inputAge() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input your age:");
//        String input = scanner.nextLine();
//
//        try {
//            int age = Integer.parseInt(input);
//            if (age < 0) {
//                System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
//                return -1;
//            }
//            return age;
//        } catch (NumberFormatException e) {
//            System.out.println("Wrong inputing! Please input an age as int, input again.");
//            return -1;
//        }
//    }
//
//    public static void main(String[] args) {
//        int age = inputAge();
//        System.out.println("age: " + age);
//    }

    /// question 6
//    public static int inputAge() {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("enter your age:");
//            String input = scanner.nextLine();
//            try {
//                int age = Integer.parseInt(input);
//                if (age < 0) {
//                    System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
//                } else {
//                    return age;
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Wrong inputing! Please input an age as int, input again.");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int age = inputAge();
//        System.out.println("age: " + age);
//    }

    /// question 7
//    public static void main(String[] args) {
//        System.out.println("enter your age:");
//        int age = ScannerUtils.inputInt("Wrong inputing! Please input an age as int, input again.");
//        System.out.println("age: " + age);
//    }

    /// test question 10
    public static void main(String[] args) {
        Group group = new Group();


        System.out.println("\n   Group infomation");
        System.out.println("Group ID: " + group.getGroupID());
        System.out.println("Group Name: " + group.getGroupName());
        System.out.println("Create Date: " + group.getCreateDate());

        System.out.println("Creator: " + group.getCreatorID().getFullname());

        if (group.getAccounts().length > 0) {
            System.out.println("group member:");
            for (int i = 0; i < group.getAccounts().length; i++) {
                System.out.println(" - " + group.getAccounts()[i].getFullname());
            }
        } else {
            System.out.println("no member in this group");
        }
    }


}

