public class Answer {
    private int answerID;
    private String content;
    private Question questionID;
    private boolean isCorrect;

    public Answer() {}

    public Answer(int answerID, String content, Question questionID, boolean isCorrect) {
        this.answerID = answerID;
        this.content = content;
        this.questionID = questionID;
        this.isCorrect = isCorrect;
    }

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Question getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Question questionID) {
        this.questionID = questionID;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
