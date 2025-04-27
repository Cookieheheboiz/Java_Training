package com.vti.frontend;
import com.vti.entity.Student;
public class Program2 {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyen Van A", "Ha Noi");

        student1.setScore(7.6);
        student1.printInfo();
        student1.addScore(1.2);
        student1.printInfo();

    }
}
