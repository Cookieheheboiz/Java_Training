package com.vti.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private static int autoincrement = 1;
    private int id;
    private String name;

    public Student(String _name) {
        this.id = autoincrement++;
        this.name = _name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static String findById(List<Student> students, int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s.getName();
            }
        }
        return "There is no one";
    }

    public static List<Student> findByName(List<Student> list, String name) {
        List<Student> students = new ArrayList<>();
        for (Student s : students) {
            if (s.getName() != null && s.getName().equals(name)) {
                students.add(s);
            }
        }
        return students;
    }

    public static void printDuplicateNames(List<Student> students) {
        Map<String, Integer> nameCount = new HashMap<>();
        for (Student s : students) {
            if (s.getName() == null) continue;
            nameCount.put(s.getName(), nameCount.getOrDefault(s.getName(), 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
