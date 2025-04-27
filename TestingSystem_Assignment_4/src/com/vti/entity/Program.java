package com.vti.entity;
import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department1 = new Department(1, "Admin");
        Department department2 = new Department(2, "HR");
        Department department3 = new Department(3, "IT");

        Position position1 = new Position(1, "Dev");
        Position position2 = new Position(2, "Test");
        Position position3 = new Position(3, "Scrum Master");

        Account account1 = new Account(1, "Nguyenvana@gmail.com", "heheboiz", "Nguyen Van A", department1, position1, LocalDate.of(2023, 10, 1));
        Account account2 = new Account(2, "Nguyenvanb@gmail.com", "CR7IsGoat", "Nguyen Van B", department2, position2, LocalDate.of(2023, 5, 15));
        Account account3 = new Account(3, "Nguyenvanc@gmail.com", "messiIsGoat", "Nguyen Van C", department3, position3, LocalDate.of(2023, 2, 19));

        Group group1 = new Group(1, "Group 1", account1, LocalDate.of(2023, 10, 1));
        Group group2 = new Group(2, "Group 2", account2, LocalDate.of(2023, 5, 15));
        Group group3 = new Group(3, "Group 3", account3, LocalDate.of(2023, 2, 19));

        GroupAccount groupAccount1 = new GroupAccount(group1, account1, LocalDate.of(2023, 10, 1));
        GroupAccount groupAccount2 = new GroupAccount(group2, account2, LocalDate.of(2023, 5, 15));
        GroupAccount groupAccount3 = new GroupAccount(group3, account3, LocalDate.of(2023, 2, 19));

        TypeQuestion typeQuestion1 = new TypeQuestion(1, "Essay");
        TypeQuestion typeQuestion2 = new TypeQuestion(2, "Multiple Choice");
        TypeQuestion typeQuestion3 = new TypeQuestion(3, "Short Answer");

        CategoryQuestion categoryQuestion1 = new CategoryQuestion(1, "Java");
        CategoryQuestion categoryQuestion2 = new CategoryQuestion(2, "SQL");
        CategoryQuestion categoryQuestion3 = new CategoryQuestion(3, "Python");

        Question question1 = new Question(1, "What is Java?", categoryQuestion1, typeQuestion1, account1.getAccountID(), LocalDate.of(2023, 10, 1));
        Question question2 = new Question(2, "What is SQL?", categoryQuestion2, typeQuestion2, account2.getAccountID(), LocalDate.of(2023, 5, 15));
        Question question3 = new Question(3, "What is Python?", categoryQuestion3, typeQuestion3, account3.getAccountID(), LocalDate.of(2023, 2, 19));

        Answer answer1 = new Answer(1,"Java is a programming language.", question1, true);
        Answer answer2 = new Answer(2, "SQL is a database language.", question2, false);
        Answer answer3 = new Answer(3, "Python is a programming language.", question3, true);

        Exam exam1 = new Exam(1, "EXAM01", "Java Exam", categoryQuestion1, 60, question1, LocalDate.of(2023, 10, 1));
        Exam exam2 = new Exam(2, "EXAM02", "SQL Exam", categoryQuestion2, 45, question2, LocalDate.of(2023, 5, 15));
        Exam exam3 = new Exam(3, "EXAM03", "Python Exam", categoryQuestion3, 30, question3, LocalDate.of(2023, 2, 19));

        ExamQuestion examQuestion1 = new ExamQuestion(exam1, question1);
        ExamQuestion examQuestion2 = new ExamQuestion(exam2, question2);
        ExamQuestion examQuestion3 = new ExamQuestion(exam3, question3);

        System.out.println("Department 1: " + department1.getDepartmentName());
        System.out.println("Position 1: " + position1.getPositionName());
        System.out.println("Account 1: " + account1.getFullname());
        System.out.println("Group 1: " + group1.getGroupName());
        System.out.println("Group Account 1: " + groupAccount1.getAccountID().getFullname());
        System.out.println("Type Question 1: " + typeQuestion1.getTypeName());
        System.out.println("Category Question 1: " + categoryQuestion1.getCategoryName());
        System.out.println("Question 1: " + question1.getContent());
        System.out.println("Answer 1: " + answer1.getContent());
        System.out.println("Exam 1: " + exam1.getTitle());
        System.out.println("Exam Question 1: " + examQuestion1.getQuestionID().getContent());
        System.out.println("Exam Question 1: " + examQuestion1.getExamID().getTitle());
        System.out.println("Exam Question 1: " + examQuestion1.getExamID().getCategoryID().getCategoryName());
        System.out.println("Exam Question 1: " + examQuestion1.getExamID().getCreateDate());
    }
}
