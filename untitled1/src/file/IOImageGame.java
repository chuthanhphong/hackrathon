package file;

import model.QuestionImage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOImageGame implements IO<QuestionImage> {
    @Override
    public void writetoFile(String pathFile, List<QuestionImage> list) throws IOException {
        FileWriter fileWriter = new FileWriter(pathFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str ="ID,ImageLink,CorrectAnswer \n";
        for(QuestionImage questionImage:list){
            str+= questionImage.getId() + "," + questionImage.getLink() +","+questionImage.getCorrectAnswer() +"\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();
    }

    @Override
    public List<QuestionImage> readFromFile(String pathFile) throws IOException {
        List<QuestionImage> list = new ArrayList<>();
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine() ;
        while ((line=bufferedReader.readLine())!=null){
            String[]value = line.split(",");
            list.add(new QuestionImage(Integer.parseInt(value[0]),value[1],value[2]));
        }
        return list;

    }
}
