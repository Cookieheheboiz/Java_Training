package com.vti.entity;

public class Student {
    private int ID;
    private String name;
    private String homeTown;
    private double score;

    private static int count = 0;

    public Student(String _name, String _homeTown) {
        this.ID = ++count;
        this.name = _name;
        this.homeTown = _homeTown;
        this.score = 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void addScore(double score) {
        this.score += score;
    }

    public void printInfo() {
        System.out.println("Họ tên: " + name);
        System.out.println("Điểm: " + score);
        if (score < 4.0) {
            System.out.println("Học lực: Yếu");
        } else if (score < 6.0) {
            System.out.println("Học lực: Trung bình");
        } else if (score < 8.0) {
            System.out.println("Học lực: Khá");
        } else {
            System.out.println("Học lực: Giỏi");
        }
    }
}
