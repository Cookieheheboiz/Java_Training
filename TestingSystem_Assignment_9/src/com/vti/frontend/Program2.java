package com.vti.frontend;

import com.vti.entity.Student;

import java.util.Date;

public class Program2 {

    public static void main(String[] args) {
        Date date = new Date(120,4, 18);
        System.out.println("Date: " + date);


        Student student = new Student("Nguyen Van A");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Latest ID: " + student.getLatestId());

    }

}
