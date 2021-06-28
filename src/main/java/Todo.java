import java.util.Date;

/**
 * it is construct of To do list.
 */
public class Todo {
    // 해야 할 일 / 제목, 분류, 기한, 내용, 등록일자
    private String title;
    private String category;
    private Date deadLine;
    private String context;
    private Date date;

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

    /**
     * for get category in other method.
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
}
