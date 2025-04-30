package com.vti.entity;

public class PrintArray {
    public static <E> void printArray(E[] array) {
        for (E e : array) {
            System.out.println(e);
        }
    }
}
