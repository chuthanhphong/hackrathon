package Model;

public class Question {
    private String prompt;
    private String answer;
    private  boolean status;
    private int id;

    public Question() {
    }

    public Question(int id,String prompt, String answer) {
        this.id = id;
        this.prompt = prompt;
        this.answer = answer;
        this.status = false;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + "," + prompt +"," + answer;
    }
    public String  prompt(){
        return id + " | " + prompt +"\n";
    }
}
