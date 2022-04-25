//package lesson5;
//
//import java.util.Scanner;
//
//public class Main1 {
//    public static void main(String[] args) {
//        String[][] tours = {{"Италия", "40000", "7 дней", "самолет", "4 звезды"},
//                {"Франция", "50000", "5 дней", "самолет", "4 звезды"},
//                {"Норвегия", "86000", "6 дней", "автобус", "3 звезды"},
//                {"Норвегия", "110000", "7 дней", "самолет", "5 звезды"},
//                {"Мальдивы", "200000", "3 дней", "самолет", "3 звезды"},
//                {"Мальдивы", "250000", "8 дней", "автобус", "3 звезды"},
//                {"Италия", "60000", "11 дней", "самолет", "4 звезды"}};
//        // выбор тура по бюджету
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("На какой бюджет рассчит?");
//        String moneyToTrip = scanner.nextLine();
//
//        ToursUtils.printToursByMoney(tours, moneyToTrip);
//
//        // выбор тура по стране
//        System.out.println("есть туры по странам. введите страну для проверки :?");
//        String tourCountry = scanner.nextLine();
//        ToursUtils.printToursCountry(tours,tourCountry);
//
//        // какая средняя стоимость тура
//        System.out.println("если хотите можете проверить среднюю стоимость тура . введите да или нет :");
//        String tourSummSr = scanner.nextLine();
//        ToursUtils.printTourSummSr(tours,tourSummSr);
//
//
//    }
//}
