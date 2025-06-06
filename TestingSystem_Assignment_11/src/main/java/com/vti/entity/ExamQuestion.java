package com.vti.entity;
public class ExamQuestion {
    private Exam examID;
    private Question questionID;

    public ExamQuestion() {}

    public ExamQuestion(Exam examID, Question questionID) {
        this.examID = examID;
        this.questionID = questionID;
    }

    public Exam getExamID() {
        return examID;
    }

    public void setExamID(Exam examID) {
        this.examID = examID;
    }

    public Question getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Question questionID) {
        this.questionID = questionID;
    }
}
