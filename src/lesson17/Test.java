package lesson17;

public class Test  implements StringUtils{
    public double div;



    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        div = Double.parseDouble(number1) / Double.parseDouble(number2);
        return div;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
