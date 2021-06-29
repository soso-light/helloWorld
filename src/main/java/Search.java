import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Search {
    BufferedReader br;
    public void searchDeadline(List<Todo> list){
        System.out.println("검색할 기한 입력(MM/dd)");
        br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String deadline = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
