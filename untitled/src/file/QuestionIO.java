package file;

import Model.Question;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionIO implements IO<Question> {

    @Override
    public void writetoFile(String pathFile, List<Question> list) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            String str = "ID , Question,CorrectAnwser \n";
            for (Question question : list) {
                str += question.getId() + "," + question.getPrompt() + "," + question.getAnswer() + "\n" ;
            }
            bw.write(str);
            bw.close();
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }

    @Override
    public List<Question> readFromFile(String pathFile) throws IOException {
        List<Question> list = new ArrayList<>();
            FileReader fr = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] value = line.split(",");
                list.add(new Question(Integer.parseInt(value[0]), value[1], value[2]));
            }
        return list;
    }
}
