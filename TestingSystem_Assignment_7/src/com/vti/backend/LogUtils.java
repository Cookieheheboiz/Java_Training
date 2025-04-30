package com.vti.backend;
import com.vti.entity.MyException;

import java.io.*;
import java.time.LocalDateTime;

public class LogUtils {
    private static final String FILE_PATH = "Exception.ser";

    public static void writeLog(MyException exception) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            objectOutputStream.writeObject(exception);
            System.out.println("Write log successfully");
        } catch (IOException e) {
            System.out.println("Failed to write log: " + e.getMessage());
        }
    }

    public static void readLog() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            MyException exception = (MyException) objectInputStream.readObject();
            System.out.println("Logged Exception:");
            System.out.println(exception);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Failed to read log: " + e.getMessage());
        }
    }

}
