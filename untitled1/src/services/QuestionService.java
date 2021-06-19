package services;

import Model.Question;
import file.IOImageGame;
import model.InOutPut;
import model.QuestionImage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionService implements GeneralService<QuestionImage> {
    private final String path = "ImageGame.csv";
    private List<QuestionImage> list;
    private static QuestionService instance;
    private int point;
    IOImageGame ioImageGame = new IOImageGame();

    private QuestionService() {
        try {
            this.list = ioImageGame.readFromFile(path);
        }catch (IOException e){
            this.list =new ArrayList<>();
        }
    }

    public static QuestionService getInstance() {
        if (instance == null) {
            instance = new QuestionService();
        }
        return instance;
    }

    public List<QuestionImage> getList() {
        return list;
    }

    public void setList(List<QuestionImage> list) {
        this.list = list;
    }

    @Override
    public List<QuestionImage> findAll() {
        return this.list;
    }

    @Override
    public void create(QuestionImage questionImage) {
        this.list.add(questionImage);
        try {
            ioImageGame.writetoFile(path,list);
        } catch (IOException e) {
            System.out.println("File not found");
        }

    }

    @Override
    public void delete(int id) {
        if (findByID(id) == null) {
            System.out.println("Id này không tồn tại");
        } else {
            this.list.remove(findByID(id));
            System.out.println("Sau khi xóa");
            display();
            try {
                ioImageGame.writetoFile(path,list);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int checkId(int id) {
        for (int i = 0; i < this.list.size(); i++) {
            if (id == list.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(int Id, QuestionImage questionImage) {
        if (checkId(Id) == -1) {
            System.out.println("Id này không tồn tại");
        } else {
            questionImage.setId(Id);
            this.list.set(checkId(Id), questionImage);
            display();
        }
    }

    @Override
    public QuestionImage findByID(int id) {
        if (checkId(id) == -1) {
            return null;
        } else {
            return this.list.get(id);
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(this.list.get(i));
        }
    }
public void  playGame(){
       for(QuestionImage questionImage:list){
           System.out.println(questionImage.Ask());
           String anwser = InOutPut.Inputanswer();
           if(check(anwser,questionImage.getCorrectAnswer())){
               questionImage.setStatus(true);
               addPoint();
               System.out.println("Bạn đã trả lời đúng");
           }else{
               System.out.println("Bạn đã trả lời sai \n Đáp án đúng là : " + questionImage.getCorrectAnswer());
           }
       }
       for(QuestionImage questionImage :list){
           questionImage.setStatus(false);
           point=0;
       }
}
    public boolean check(String anwser, String a) {

        if (anwser.equals(a)) {
            return true;
        }
        return false;
    }
    @Override
    public void addPoint() {
        this.point += 10;
    }
}
