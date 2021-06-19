package Model;

import services.QuestionService;

public class Test {
    public static void main(String[] args) {

    Question question = new Question();
    QuestionService questionService = new QuestionService();

        questionService.create(new Question(1, "Mày tên gì ? " + "(a)A\t(b)B\t(c)C\t(d)D", "a"));
        questionService.create(new Question(2, "Mày là ai ? " + "(a)A\t(b)B\t(c)C\t(d)D", "a"));
        questionService.create(new Question(3, "ở đâu ? " + "(a)A\t(b)B\t(c)C\t(d)D", "a"));
        questionService.playGame();


}}
