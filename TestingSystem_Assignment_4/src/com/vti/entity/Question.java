package com.vti.entity;
import java.time.LocalDate;

public class Question {
    private int questionID;
    private String content;
    private CategoryQuestion categoryID;
    private TypeQuestion typeID;
    private int creatorID;
    private LocalDate createDate;

    public Question() {}

    public Question(int questionID, String content, CategoryQuestion categoryID, TypeQuestion typeID, int creatorID, LocalDate createDate) {
        this.questionID = questionID;
        this.content = content;
        this.categoryID = categoryID;
        this.typeID = typeID;
        this.creatorID = creatorID;
        this.createDate = createDate;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CategoryQuestion getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(CategoryQuestion categoryID) {
        this.categoryID = categoryID;
    }

    public TypeQuestion getTypeID() {
        return typeID;
    }

    public void setTypeID(TypeQuestion typeID) {
        this.typeID = typeID;
    }

    public int getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
