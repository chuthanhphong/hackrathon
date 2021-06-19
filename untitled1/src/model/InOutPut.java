package model;

import java.util.Locale;
import java.util.Scanner;

public class InOutPut {
    private static final Scanner sc = new Scanner(System.in);
        public static String Inputanswer(){
            System.out.println("Please chosse your anwser");
            String anwser = sc.nextLine().trim().toLowerCase();
            return anwser;
        }
    }

