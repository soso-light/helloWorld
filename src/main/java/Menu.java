import java.util.Scanner;

public class Menu {

    public void printMenu (){
        System.out.println(" ");
        System.out.println("**To Do List**");
        System.out.println("[1]할 일 조회");
        System.out.println("[2]할 일 추가");
        System.out.println("[3]수정");
        System.out.println("[4]삭제");
        System.out.println("[5]파일저장");
        System.out.println("[0]종료");
        System.out.println("**************");
    }

    public int chooseMenu(){
        int menu;
        printMenu();
        System.out.println("메뉴를 선택하세요 : ");
        Scanner input = new Scanner(System.in);
        menu = input.nextInt();
        return menu;
    }
}
