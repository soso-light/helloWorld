import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
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
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
