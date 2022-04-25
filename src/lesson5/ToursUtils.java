//package lesson5;
//
//public class ToursUtils {
//
//    public static void printToursByMoney(String[][] tours, String moneyToTrip) {
//        // moneyToTrip-100000
//        int moneyFromUser = Integer.parseInt(moneyToTrip);
//        for (int i = 0; i < tours.length; i++) {
//
//            String tourCostStr = tours[i][1];
//            int tourcost = Integer.parseInt(tourCostStr); // конвертируем в инты стринги
//            if ((tourcost > (moneyFromUser - 20000)) && (tourcost < (moneyFromUser + 20000))) {
//                System.out.printf("Тур: %s, %s руб, %s, транспорт- %s, отель - 5s \n",
//                        tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4]);
//            }
//        }
//    }
//
//
//    public static void printToursCountry(String[][] tours, String tourCountry) {
//        //int tourCountryuser = Integer
//        for (int i = 0; i < tours.length; i++) {
//            String toursFromList = tours[i][0];
//            if (toursFromList.equals(tourCountry)) {
//                System.out.println(tours[i][0] + "Да есть");
//            }
//        }
//    }
//
//    public static void printTourSummSr(String[][] tours, String tourSummSr) {
//        int srSummInt = 0;
//        if (tourSummSr.equals("Да")) {
//            for (int i = 0; i < tours.length; i++) {
//                String tourCostStr = tours[i][1];
//                int tourCost = Integer.parseInt(tourCostStr);
////            tourCost = tourCost+tourCost;
//                srSummInt = srSummInt + tourCost;
//                int sumItogov = srSummInt / tours.length;
//                System.out.println(sumItogov);
//            }
//        } else if (tourSummSr.equals("Нет")) {
//            System.out.println("Ну и ладно =(");
//        } else {
//            System.out.println("ee");
//        }
//    }
//
//
//
//
