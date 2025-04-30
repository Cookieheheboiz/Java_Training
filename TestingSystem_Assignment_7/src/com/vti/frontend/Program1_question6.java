package com.vti.frontend;

import com.vti.entity.PrimaryStudent;
import com.vti.entity.SecondaryStudent;

public class Program1_question6 {
    public static void main(String[] args) {
        PrimaryStudent[] students1 = new PrimaryStudent[2];
        SecondaryStudent[] students2 = new SecondaryStudent[6];

        students1[0] = new PrimaryStudent(1, "Nguyen Van A");
        students1[1] = new PrimaryStudent(2, "Nguyen Van B");

        students2[0] = new SecondaryStudent(3, "Nguyen Van C");
        students2[1] = new SecondaryStudent(4, "Nguyen Van D");
        students2[2] = new SecondaryStudent(5, "Nguyen Van E");
        students2[3] = new SecondaryStudent(6, "Nguyen Van F");
        students2[4] = new SecondaryStudent(7, "Nguyen Van G");
        students2[5] = new SecondaryStudent(8, "Nguyen Van H");


        System.out.println("So luong PrimaryStudent: " + PrimaryStudent.getCountPrimaryStudent());
        System.out.println("So luong SecondaryStudent: " + SecondaryStudent.getCountSecondaryStudent());


    }

}
