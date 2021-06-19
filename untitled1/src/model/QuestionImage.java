package model;

public class QuestionImage {
    private int id;
    private String link;
    private  String correctAnswer;
    private boolean status;

    public QuestionImage() {
    }

    public QuestionImage(int id, String link, String correctAnswer) {
        this.id = id;
        this.link = link;
        this.correctAnswer = correctAnswer;
        this.status = false;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Question{" +
                "link='" + link + '\'' +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", status=" + status +
                '}';
    }
    public String Ask(){
        return this.id + " | " + this.link;
    }
}
