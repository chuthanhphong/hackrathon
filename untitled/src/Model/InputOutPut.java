package Model;

import java.util.Scanner;

public class InputOutPut {
    static final Scanner sc = new Scanner(System.in);

    public static void input() {
        Question question = new Question();
        System.out.println("Please input ID Questions : ");
        int id = -1;

        do {
            try {
                id = Integer.parseInt(sc.nextLine());
                if (id == question.getId() || id == -1) {
                    System.out.println("ID is eixist, Please Input Id again");
                }
            } catch (Exception e) {
                System.out.println("Id not right format, Please Input Id again");
            }

        } while (id == question.getId() || id == -1);
        System.out.println("Please Input your Questions");
    }
    public static String Inputanswer(){
        System.out.println("Please chosse your anwser");
        String anwser = sc.nextLine();
        return anwser;
    }

}
