package com.vti.frontend;

import com.vti.entity.Car;

public class Program3_question2 {
    public static void main(String[] args) {
        Car car = new Car("Mazda", "8WD");
        Car.Engine engine = car.new Engine("Crysler");
        System.out.println("Car Name: " + car.getName());
        System.out.println("Car Type: " + car.getType());
        System.out.println("Car Engine Type: " + engine.getEngineType());
    }

    /// Câu 3 : cả hai lần đều in ra "Đây là inner class"

    /// Câu 4: output là "Ngày: 31/10/2017" và "Giờ: 10:15:30"

}
