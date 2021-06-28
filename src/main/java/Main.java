import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Todo> toDoList;

    public static void main(String[] args){
        Main myList = new Main();
        myList.run();
    }
    public void run(){
        toDoList = new ArrayList<>();
        Menu menu = new Menu();
        menu.printMenu();
        System.out.println("원하는 메뉴는?");
    }
}
