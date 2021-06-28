import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Todo> toDoList;
    private int menuNum;

    public static void main(String[] args){
        Main myList = new Main();
        myList.run();
    }
    public void run(){
        toDoList = new ArrayList<>(1);
        Menu menu = new Menu();
        menuNum = menu.chooseMenu();
        boolean t = true;
        while(t){
            t = menuChosen(menuNum);
        }
    }

    private boolean menuChosen(int input){
        Crud crud = new Crud();
        switch (input){
            case 1: crud.readToDo(toDoList);
                    break;
            case 2: crud.createToDo(toDoList);
                    //break;
            case 3: //readToDo();
                    //break;
            case 4: //readToDo();
                    //break;
            case 0: return false;
            default: System.out.println("다시 입력하세요.");
        }
        return true;
    }

}
