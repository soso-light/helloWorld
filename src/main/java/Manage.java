import java.util.ArrayList;
import java.util.List;

public class Manage {
    private List<Todo> toDoList;
    private int menuNum;
    private Crud crud = new Crud();
    private FileService fileService = new FileService();

    public void run(){
        toDoList = new ArrayList<>(1);
        Menu menu = new Menu();
        boolean t = true;
        while(t){
            menuNum = menu.chooseMenu();
            t = menuChosen(menuNum);
        }
    }

    private boolean menuChosen(int input){
        switch (input){
            case 1: case 2: case 3: case 4: toDoList = crud.menu1234(toDoList, input);
                    break;
            case 5: fileService.saveFile(toDoList);
                    break;
            case 0: return false;
            default: System.out.println("다시 입력하세요.");
        }
        return true;
    }

}