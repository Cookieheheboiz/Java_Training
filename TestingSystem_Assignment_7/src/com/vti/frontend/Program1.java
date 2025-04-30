package com.vti.frontend;
import com.vti.entity.Student;
public class Program1 {
    /// question 1 + 2 (Exercise 1)
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "Nguyen Van A");
        students[1] = new Student(2, "Nguyen Van B");
        students[2] = new Student(3, "Nguyen Van C");

        for (Student s: students) {
            System.out.println("ID: " + s.getId() + ", Name: " + s.getName() + ", College: " + Student.college);
        }

        Student.college = "Dai hoc Cong Nghe";

        for (Student s: students) {
            System.out.println("ID: " + s.getId() + ", Name: " + s.getName() + ", College: " + Student.college);
        }

        for (Student s: students) {
            Student.moneyGroup += 100;
        }
        System.out.println("B1 Money Group: " + Student.moneyGroup);

        Student.moneyGroup -= 50;
        System.out.println("B2 Money Group: " + Student.moneyGroup);

        Student.moneyGroup -= 20;
        System.out.println("B3 Money Group: " + Student.moneyGroup);

        Student.moneyGroup -= 150;
        System.out.println("B4 Money Group: " + Student.moneyGroup);

        for (Student s: students) {
            Student.moneyGroup += 50;
        }
        System.out.println("B5 Money Group: " + Student.moneyGroup);

    }
}
