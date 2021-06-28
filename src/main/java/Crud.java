import java.util.List;

public class Crud {
    public void readToDo(List<Todo> list) {
        System.out.println("등록일자 분류\t제목\t 기한   내용");
        System.out.println("------------------------------");
        for(Todo x : list){
            System.out.println(x.getDate() + " " + x.getCategory() + "\t" +
                    x.getTitle() + "\t" + x.getDeadLine() + " " + x.getContext());
        }
    }

    public List<Todo> createToDo(List<Todo> list) {
        return list;
    }
}