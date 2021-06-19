package file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IO<T> {
    void writetoFile(String pathFile, List<T> list) throws IOException;
    List<T>  readFromFile(String pathFile) throws IOException;
}
