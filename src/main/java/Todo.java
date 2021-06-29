import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * it is construct of To do list.
 */
public class Todo {
    private SimpleDateFormat fDate = new SimpleDateFormat("MM/dd hh:mm");
    // 해야 할 일 / 제목, 분류, 기한, 내용, 등록일자
    private String title;
    private Date deadLine;
    private String context;
    private Date date;

    public Todo(){
        title=null;
        date=null;
        deadLine=null;
        context=null;
    }
    public Todo(String title, String date, String deadLine, String context){
        this.title = title;
        try {
            this.date = fDate.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            this.deadLine = fDate.parse(deadLine);
        } catch (ParseException e) {
            e.printStackTrace();
        }
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

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String stDate = fDate.format(date);
        String stDeadLine = fDate.format(deadLine);
        return this.title + " / " + stDate+ " / " + stDeadLine+ " / " + this.context;
    }
}
