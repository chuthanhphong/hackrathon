package Test;

import model.QuestionImage;
import services.QuestionService;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String a1 = "D:\\New folder\\Hackathon\\untitled1\\src\\image\\1-cautha.jpg";
        String a2 = "D:\\New folder\\Hackathon\\untitled1\\src\\image\\2-bovai.jpg";
        String a3 = "D:\\New folder\\Hackathon\\untitled1\\src\\image\\3-amthanh.jpg";
        String a4 = "D:\\New folder\\Hackathon\\untitled1\\src\\image\\4-nhangoaicam.jpg";
        String a5 = "D:\\New folder\\Hackathon\\untitled1\\src\\image\\5-banbac.jpg";
        String a6 = "D:\\New folder\\Hackathon\\untitled1\\src\\image\\6-traiy.jpg";
        String a7 = "D:\\New folder\\Hackathon\\untitled1\\src\\image\\7-nhasy.jpg";
        String a8 = "D:\\New folder\\Hackathon\\untitled1\\src\\image\\8-khacbiet.jpg";
        String a9 = "D:\\New folder\\Hackathon\\untitled1\\src\\image\\9-thuyenrong.jpg";
        String a10 = "D:\\New folder\\Hackathon\\untitled1\\src\\image\\10-bientuong.jpg";

        List<String> list  = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);
        list.add(a7);
        list.add(a8);
        list.add(a9);
        list.add(a10);
        for (int j = 0;j<list.size();j++) {
            int i = (int) Math.floor(Math.random() * QuestionService.getInstance().getList().size());
            System.out.println(QuestionService.getInstance().getList().get(i).Ask());
        }
//        QuestionService.getInstance().create(new QuestionImage(1,a1,"cẩu thả"));
//        QuestionService.getInstance().create(new QuestionImage(2,a2,"bờ vai"));
//        QuestionService.getInstance().create(new QuestionImage(3,a3,"âm thanh"));
//        QuestionService.getInstance().create(new QuestionImage(4,a4,"nhà ngoại cảm"));
//        QuestionService.getInstance().create(new QuestionImage(5,a5,"bàn bạc"));
//        QuestionService.getInstance().create(new QuestionImage(6,a6,"trái ý"));
//        QuestionService.getInstance().create(new QuestionImage(7,a7,"nha sỹ"));
//        QuestionService.getInstance().create(new QuestionImage(8,a8,"khác biệt"));
//        QuestionService.getInstance().create(new QuestionImage(9,a9,"thuyền rồng"));
//        QuestionService.getInstance().create(new QuestionImage(10,a10,"biến tướng"));

    }
}
