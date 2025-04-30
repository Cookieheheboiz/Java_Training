package com.vti.frontend;

import com.vti.entity.CPU;

public class Program3 {
    public static void main(String[] args) {
        CPU cpu = new CPU(1000);
        CPU.Processor processor = cpu.new Processor(8, "Intel");
        CPU.RAM ram = cpu.new RAM(8, "Kingston");
        System.out.println("Cache: " + processor.getCache());
        System.out.println("Clock Speed: " + ram.getClockSpeed());
    }

}
