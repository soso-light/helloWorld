import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * it is construct of To do list.
 */
public class Todo {
    private SimpleDateFormat fDate = new SimpleDateFormat("MM/dd hh:mm");
    // 해야 할 일 / 제목, 분류, 기한, 내용, 등록일자
    private int number;
    private String title;
    private String deadLine;
    private String context;
    private String date;

    public Todo(){
        title=null;
        date = fDate.format(new Date(System.currentTimeMillis()));//제목
        deadLine=null;
        context=null;
    }
    public Todo(String title, String date, String deadLine, String context){
        this.title = title;
        this.date = date;
        this.deadLine = deadLine;
        this.context = context;
    }

    /**
     * for get title in other method.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return this.number + " | " + this.title + " | " + this.date+ " | " + this.deadLine+ " | " + this.context;
    }
}
