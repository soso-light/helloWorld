import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    public void saveFile(List<Todo> list){
        String path = Paths.get(".").toAbsolutePath().toString();
        String filename = path + "/data.txt";
        try {
            File file = new File(filename);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(Todo t : list){
                bw.write(t.toString());
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("파일이 저장되었습니다.");
    }

    public List<Todo> readFile() {
        List<Todo> toDoList = new ArrayList<Todo>();
        String path = Paths.get(".").toAbsolutePath().toString();
        String filename = path + "/data.txt";



        return toDoList;
    }
}
