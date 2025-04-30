package com.vti.entity;

public class Employee<E> {
    private int id;
    private String name;
    private E[] salaries;

    public Employee(int id, String name, E[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }

    public void printInfomation() {
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Salaries:");
        for (E salary : salaries) {
            System.out.println(salary);
        }
    }

    public void printLastSalary() {
            System.out.println("Last salary: " + salaries[salaries.length - 1]);
    }
}
