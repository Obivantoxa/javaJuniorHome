package lesson6;

import java.util.Scanner;

public class ScannerUtils {

    public static String getLevelFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите уровень сложности: ");
        System.out.println("1 новичок");
        System.out.println("2 любитель");
        System.out.println("3 профессионал");
        System.out.println("4 особый");
        String inputLevel = scanner.nextLine();
        if (!inputLevel.equals("1") &&
                !inputLevel.equals("2") &&
                !inputLevel.equals("3") &&
                !inputLevel.equals("4") &&
                !inputLevel.equalsIgnoreCase("Новичок") &&
                !inputLevel.equalsIgnoreCase("Любитель") &&
                !inputLevel.equalsIgnoreCase("Профессионал") &&
                !inputLevel.equalsIgnoreCase("Особый")) {
            return getLevelFromUser(); // рекурсивный метод вызова
        }
        return inputLevel;
    }
}
