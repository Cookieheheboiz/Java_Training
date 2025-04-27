import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(1, "Nguyen Van A", 1);
        Student student2 = new Student(2, "Nguyen Van B", 1);
        Student student3 = new Student(3, "Nguyen Van C", 1);
        Student student4 = new Student(4, "Nguyen Van D", 2);
        Student student5 = new Student(5, "Nguyen Van E", 2);
        Student student6 = new Student(6, "Nguyen Van F", 2);
        Student student7 = new Student(7, "Nguyen Van G", 3);
        Student student8 = new Student(8, "Nguyen Van H", 3);
        Student student9 = new Student(9, "Nguyen Van I", 3);
        Student student10 = new Student(10, "Nguyen Van J", 3);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);

        for (Student student : students) {
            student.diemDanh();
        }

        for (Student student : students) {
            if (student.getGroup() == 1) {
                student.hocBai();
            }
        }

        for (Student student : students) {
            if (student.getGroup() == 2) {
                student.donVeSinh();
            }
        }
    }


}
