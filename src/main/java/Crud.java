import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Crud {
    final private SimpleDateFormat fDate = new SimpleDateFormat("MM/dd hh:mm");

    public List<Todo> menu1234(List<Todo> list, int menu){
        switch (menu){
            case 1: readToDo(list);
                break;
            case 2: list = createToDo(list);
                break;
            case 3: list = updateToDo(list);
                break;
            case 4: list = deleteToDo(list);
                break;
        }
        return list;
    }
    private void readToDo(List<Todo> list) {
        System.out.println("No\t등록일자\t\t 제목\t기한\t\t\t내용");
        System.out.println("------------------------------------------");
        if(list == null) return;
        for(int i=0; i<list.size(); i++){
            Todo x = list.get(i);
            int j = i+1;
            Date date = x.getDate();
            Date deadLine = x.getDeadLine();
            System.out.println(j + "\t" + fDate.format(date)  + "\t " + x.getTitle() + "\t" + fDate.format(deadLine) + "\t\t" + x.getContext());
        }
        System.out.println(" ");
    }

    private List<Todo> createToDo(List<Todo> list) {
        //Date date;
        String title;
        String deadLine;
        String context;
        Todo newOne = new Todo();
        //제목
        //date = new Date(System.currentTimeMillis());//제목
        System.out.println("제목을 입력하세요.");
        Scanner write =  new Scanner(System.in);
        title = write.nextLine();
        newOne.setTitle(title);
        //기한
        System.out.println("마감 기한을 입력하세요(MM/dd hh:mm).");
        write =  new Scanner(System.in);
        deadLine = write.nextLine();
        try {
            Date n = fDate.parse(deadLine);
            newOne.setDeadLine(n);
        } catch (ParseException e) {
            System.out.println("형식에 따라 입력하지 않았습니다(MM/dd hh:mm).");
            e.printStackTrace();
        }
        //내용
        System.out.println("내용을 입력하세요.");
        write =  new Scanner(System.in);
        context = write.nextLine();
        newOne.setContext(context);
        // add To do
        list.add(newOne);
        return list;
    }

    private int selectNumber(){
        int index;
        System.out.println("수정할 할 일의 번호를 선택하세요.");
        Scanner input = new Scanner(System.in);
        index = input.nextInt();
        System.out.println("정말로 실행하시겠습니까?(취소 -1 입력) ");
        input = new Scanner(System.in);
        int reCheck = input.nextInt();
        if (reCheck == -1) return -1;
        return index-1;
    }

    private List<Todo> updateToDo(List<Todo> list) {
        readToDo(list);
        int index = selectNumber();
        if(index<0 || index>=list.size()){
            System.out.println("잘못 입력하셨습니다.");
            return list;
        }
        String title;
        String deadLine;
        String context;
        Todo alreadyOne = list.get(index);
        //제목
        System.out.println("제목을 입력하세요.");
        Scanner write =  new Scanner(System.in);
        title = write.nextLine();
        alreadyOne.setTitle(title);
        //기한
        System.out.println("마감 기한을 입력하세요(MM/dd hh:mm).");
        write =  new Scanner(System.in);
        deadLine = write.nextLine();
        try {
            Date n = fDate.parse(deadLine);
            alreadyOne.setDeadLine(n);
        } catch (ParseException e) {
            System.out.println("형식에 따라 입력하지 않았습니다(MM/dd hh:mm).");
            e.printStackTrace();
        }
        //내용
        System.out.println("내용을 입력하세요.");
        write =  new Scanner(System.in);
        context = write.nextLine();
        alreadyOne.setContext(context);
        return list;
    }

    private List<Todo> deleteToDo(List<Todo> list) {
        readToDo(list);
        int index = selectNumber();
        list.remove(index);
        System.out.println("삭제되었습니다.");
        return list;
    }
}