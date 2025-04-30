package com.vti.frontend;

import com.vti.backend.ScannerUtils;
import com.vti.entity.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Program5_question1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter student ID" + (i + 1) + ": ");
            int id = ScannerUtils.inputInt("Wrong inputting! Please enter a valid ID.");
            System.out.print("Enter student name" + (i + 1) + ": ");
            String name = ScannerUtils.inputString();
            students.add(new Student(id, name));
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Java_Trainning\\TestingSystem_Assignment_6\\src\\StudentInformation.txt"))) {
            for (Student student : students) {
                bufferedWriter.write(student.getId() + " " + student.getName());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Failed to write to a file: " + e.getMessage());
        }
    }
}
