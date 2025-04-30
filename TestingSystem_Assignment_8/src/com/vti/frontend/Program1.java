package com.vti.frontend;

import com.vti.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Nguyen Van A"));
        students.add(new Student("Nguyen Van B"));
        students.add(new Student("Nguyen Van C"));
        students.add(new Student("Nguyen Van D"));
        students.add(new Student("Nguyen Van A"));
        students.add(new Student("Nguyen Van A"));

        System.out.println("Number of students: " + students.size());

        System.out.println("Student number 4: " + students.get(3).getName());

        System.out.println("Student number 1: " + students.get(0).getName());
        System.out.println("Get last student: " + students.get(students.size() - 1).getName());

        students.add(0, new Student("Nguyen Van 1"));

        students.add(new Student("Nguyen Van Cuoi"));

        Collections.reverse(students);


        System.out.println("i) Các student có tên trùng:");
        Student.printDuplicateNames(students);


        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == 2) {
                students.get(i).setName(null);
                break;
            }
        }


        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == 5) {
                students.remove(i);
                break;
            }
        }

        List<Student> studentCopies = new ArrayList<>(students);
        System.out.println("Student copies: ");
        for (Student student : studentCopies) {
            System.out.println(student.getName());
        }


    }
}
