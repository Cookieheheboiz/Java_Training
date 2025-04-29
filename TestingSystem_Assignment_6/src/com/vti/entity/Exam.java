package com.vti.entity;
import com.vti.entity.CategoryQuestion;

import java.time.LocalDate;

public class Exam {
    private int examID;
    private String code;
    private String title;
    private CategoryQuestion categoryID;
    private int duration;
    private Question creatorID;
    private LocalDate createDate;

    public Exam() {}

    public Exam(int examID, String code, String title, CategoryQuestion categoryID, int duration, Question creatorID, LocalDate createDate) {
        this.examID = examID;
        this.code = code;
        this.title = title;
        this.categoryID = categoryID;
        this.duration = duration;
        this.creatorID = creatorID;
        this.createDate = createDate;
    }

    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryQuestion getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(CategoryQuestion categoryID) {
        this.categoryID = categoryID;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Question getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(Question creatorID) {
        this.creatorID = creatorID;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
