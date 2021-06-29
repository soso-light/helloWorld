import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Search {
    BufferedReader br;
    public void menu67(List<Todo> list, int menu){
        switch (menu){
            case 6: searchDeadline(list);
                break;
            case 7: searchTitle(list);
                break;
        }
    }
    public void searchDeadline(List<Todo> list){
        System.out.println("검색할 기한 입력(MM/dd)");
        br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String deadline = br.readLine();
            System.out.println("No\t등록일자\t\t 제목\t기한\t\t\t내용");
            System.out.println("------------------------------------------");
            for(Todo t : list){
                if(t.getDeadLine().contains(deadline)) {
                    System.out.println(t.getNumber() + "\t" + t.getDate() + "\t " + t.getTitle() + "\t" + t.getDeadLine() + "\t\t" + t.getContext());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void searchTitle(List<Todo> list){
        System.out.println("검색할 제목 입력");
        br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String title = br.readLine();
            System.out.println("No\t등록일자\t\t 제목\t기한\t\t\t내용");
            System.out.println("------------------------------------------");
            for(Todo t : list){
                if(t.getTitle().contains(title)) {
                    System.out.println(t.getNumber() + "\t" + t.getDate() + "\t " + t.getTitle() + "\t" + t.getDeadLine() + "\t\t" + t.getContext());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
