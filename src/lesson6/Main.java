package lesson6;


public class Main {
    public static void main(String[] args) {
        String level =ScannerUtils.getLevelFromUser();
        int[][] field = SaperUtils.createGameField(level);
        int countMines = SaperUtils.countMinesByLevel(level);
        int[][] fieldsWithMines = SaperUtils.feelRandomMines(field, countMines);
        SaperUtils.printMinesFromField(fieldsWithMines);
    }
}
