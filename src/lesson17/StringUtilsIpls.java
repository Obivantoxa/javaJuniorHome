package lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsIpls implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {

        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null|| number2==null");// остановит выполнение  кода вниз
        }

        double num1 = 0;
        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1 - не число!!");
        }

        double num2 = 0;
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number2 - не число!!");
        }
        if (num2 == 0.0) {
            throw new ArithmeticException("delenie na 0 nelzya");
        }
        return num1 / num2;
    }


    @Override
    public int[] findWord(String text, String word) throws NullPointerException {

        String[] textMassiv = text.split(" ");
        int countWord = 0;
        int[] indexOfWord = new int[textMassiv.length];

        for (int i = 0; i < textMassiv.length; i++) {
            if (textMassiv[i].equalsIgnoreCase(word)) {
                countWord++;
                indexOfWord[countWord - 1] = i + 1;
                System.out.println(" Cовпадение  в слове под номером - " + (i + 1));
            }
        }


        if (countWord == 0) {
            System.out.println(" Нет такого слова!!! ");
            return new int[0];
        }


        int[] indexOfWordFormatted = new int[countWord];


        for (int i = 0; i < indexOfWord.length; i++) {

            for (int k = 0; k < indexOfWordFormatted.length; k++) {

                if (indexOfWord[i] != 0 && indexOfWordFormatted[k] == 0) {
                    indexOfWordFormatted[k] = indexOfWord[i];
                    k = indexOfWordFormatted.length;
                }

            }

        }

        return indexOfWordFormatted;
    }


    @Override
    public double[] findNumbers(String text) throws CustomException {

        String regularExpressionForDouble = "((\\d)+(\\.(\\d)+)?)";
        Matcher matcher = Pattern.compile(regularExpressionForDouble).matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());

            return new double[0];
        }
        return new double[0];
    }
}


