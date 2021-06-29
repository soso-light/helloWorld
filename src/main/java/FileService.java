import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileService {
    private final String path = Paths.get(".").toAbsolutePath().toString();
    private final String filename = path + "/data.txt";

    public void saveFile(List<Todo> list){
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
        List<Todo> toDoList = new ArrayList<>();

        try {
            File file = new File(filename);
            FileReader fileReader = new FileReader(file);
            BufferedReader bfReader = new BufferedReader(fileReader);

            String line;
            while((line = bfReader.readLine()) != null){
                toDoList = parseFile(line, toDoList);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return toDoList;
    }

    private List<Todo> parseFile (String line, List<Todo> toDoList){
        StringTokenizer st = new StringTokenizer(line, "|");
        int number = Integer.parseInt(st.nextToken().trim());
        String title = st.nextToken().trim();
        String date = st.nextToken().trim();
        String deadline = st.nextToken().trim();
        String context = st.nextToken().trim();
        toDoList.add(new Todo(number, title, date, deadline, context));

        return toDoList;
    }
}
