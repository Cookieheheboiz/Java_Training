package com.vti.frontend;
import com.vti.entity.*;

public class Program3 {
    public static void main(String[] args) {
        Student_<Integer> s1 = new Student_<>(1, "A");
        Student_<Float> s2 = new Student_<>(2.5f, "B");
        Student_<Double> s3 = new Student_<>(3.1415, "C");
        System.out.println(s1.getId() + " " + s1.getName());
        System.out.println(s2.getId() + " " + s2.getName());
        System.out.println(s3.getId() + " " + s3.getName());


        PrintInformation.print(3);


        Integer[] i = {1, 2, 3};
        Float[] f = {1.1f, 2.2f};
        Long[] l = {100L, 200L};
        Double[] d = {1.11, 2.22};

        PrintArray.printArray(i);
        PrintArray.printArray(f);
        PrintArray.printArray(l);
        PrintArray.printArray(d);

        Integer[] intSalaries = {100, 200, 50};
        Employee<Integer> employee1 = new Employee<>(1, "Nguyen Van A", intSalaries);
        employee1.printInfomation();
        employee1.printLastSalary();

        Float[] floatSalaries = {400.2f, 600.7f, 503.2f};
        Employee<Float> employee2 = new Employee<>(2, "Nguyen Van B", floatSalaries);
        employee2.printInfomation();
        employee2.printLastSalary();

        Double[] doubleSalaries = {560.43, 120.13, 51.11};
        Employee<Double> employee3 = new Employee<>(3, "Nguyen Van C", doubleSalaries);
        employee3.printInfomation();
        employee3.printLastSalary();

        MyMap<String, String> map_ = new MyMap<>("abc123", "Nguyen Van a");
        System.out.println("Key: " + map_.getKey());
        System.out.println("Value: " + map_.getValue());

        Phone<String, String> phone1 = new Phone<>("abc@gmail.com", "0124234554");
        Phone<String, String> phone2 = new Phone<>("1", "0654354234");
        Phone<String, String> phone3 = new Phone<>("Nguyen Van A", "0658768967");
        System.out.println("Phone1: " + phone1.getKey() + " " + phone1.getPhoneNumber());
        System.out.println("Phone2: " + phone2.getKey() + " " + phone2.getPhoneNumber());
        System.out.println("Phone3: " + phone3.getKey() + " " + phone3.getPhoneNumber());

        Staff<Integer, String> staff1 = new Staff<>(1, "Nguyen Van A");
        System.out.println("Staff1: " + staff1.getId() + " " + staff1.getName());

    }


}
