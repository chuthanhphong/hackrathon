package services;

import Model.InputOutPut;
import Model.Question;
import file.QuestionIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionService implements GeneralService<Question> {
    QuestionIO questionIO = new QuestionIO();
    private int point = 0;
    private List<Question> list;
    private static QuestionService instance;
    Question question = new Question();

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public List<Question> getList() {
        return list;
    }

    public void setList(List<Question> list) {
        this.list = list;
    }

    public static QuestionService getInstance() {
        if (instance == null) {
            instance = new QuestionService();
        }
        return instance;
    }

    public QuestionService() {
        try {
            this.list = questionIO.readFromFile("D:\\New folder\\Hackathon\\DataQuizzhihii.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Question> findAll() {
        return list;
    }

    @Override
    public void create(Question question) {
        list.add(question);
        questionIO.writetoFile("Quizz.csv",list);

    }

    @Override
    public void delete(int id) {
    list.remove(question);
    }

    @Override
    public void update(int Id, Question question) {
        if(findByID(Id)==null){
            System.out.println("ID not Found");
        }else {
            question.setId(Id);
            list.set(Id,question);
            for(Question question1: list){
                System.out.println(question1);
            }
        }
    }

    public int checkId(int id){
        for (int i = 0; i < this.list.size(); i++) {
            if (id==list.get(i).getId()){
                return i;
            }
        }
        return -1;
    }
    @Override
    public Question findByID(int id) {
        if (checkId(id) == -1){
            return null;
        }else {
            return this.list.get(id);
        }
    }

    @Override
    public void display() {
        for (Question question:list){
            System.out.println(question);
        }
    }

    public void playGame() {
      for(Question question:list){
          System.out.println(question.prompt());
          String aswner = InputOutPut.Inputanswer();
          if(check(aswner,question.getAnswer())){
              addPoint();
              System.out.println("Bạn đã trả lời đúng");
          }else{
              System.out.println("Bạn đã trả lời sai \n Đáp án đúng là : " + question.getAnswer());
          }
      }

        System.out.println("Số điểm của bạn là :" + point);
        for(Question question:list){
            question.setStatus(false);
        }
        point=0;

    }


    public boolean check(String anwser, String a) {

        if (anwser.equals(a)) {
            return true;
        }
        return false;
    }

    @Override
    public void addPoint() {
        point+=10;
//         for(Question question:list){
//             if(question.isStatus()){
//                 point+=10;
//             }
////             else {
////                 point-=5;
////             }
//             }
//         return point;
         }
    }

