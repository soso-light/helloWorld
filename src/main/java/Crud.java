import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Crud {
    public void readToDo(List<Todo> list) {
        System.out.println("No\t등록일자\t제목\t 기한   내용");
        System.out.println("---------------------------------");
        if(list == null) return;
        for(int i=0; i<list.size(); i++){
            Todo x = list.get(i);
            int j = i+1;
            SimpleDateFormat fDate = new SimpleDateFormat("MM/dd hh:mm");
            Date date = x.getDate();
            Date deadLine = x.getDeadLine();
            System.out.println(j + "\t" + fDate.format(date)  + "\t" + x.getTitle() + "\t" + fDate.format(deadLine) + " " + x.getContext());
        }
        System.out.println("\n");
    }

    public List<Todo> createToDo(List<Todo> list) {
        Date date;
        String title;
        String deadLine;
        String context;
        Todo newOne = new Todo();
        //등록일자
        SimpleDateFormat fDate = new SimpleDateFormat("MM/dd hh:mm");
        date = new Date(System.currentTimeMillis());
        String sDate = fDate.format(date);
        try {
            date = fDate.parse(sDate);
            newOne.setDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //제목
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
        System.out.println("정말로 수정하시겠습니까? ");
        input = new Scanner(System.in);
        int reCheck = input.nextInt();
        if (reCheck == -1) return -1;
        return index-1;
    }

    public List<Todo> updateToDo(List<Todo> list) {
        readToDo(list);
        int index = selectNumber();
        if(index<0 || index>=list.size()){
            System.out.println("잘못 입력하셨습니다.");
            return list;
        }
        Date date;
        String title;
        String deadLine;
        String context;
        Todo alreadyOne = list.get(index);
        //등록일자
        SimpleDateFormat fDate = new SimpleDateFormat("MM/dd hh:mm");
        date = new Date(System.currentTimeMillis());
        String sDate = fDate.format(date);
        try {
            date = fDate.parse(sDate);
            alreadyOne.setDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
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
        alreadyOne.setTitle(context);
        return list;
    }

    public List<Todo> deleteToDo(List<Todo> list) {
        readToDo(list);
        int index = selectNumber();
        list.remove(index);
        return list;
    }
}