package buoi02;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int ch;
        StudentList studentList = new StudentList();
        while (true) {
            ch = Menu.userChoice();
            switch (ch) {
                case 1:
                    studentList.create();
                    break;
                case 2:
                    studentList.display();
                    break;
                case 3:
                    studentList.remove();
                    break;
                case 4:
                    studentList.update();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
