package lesson10;

public class Matrix implements IMatrix {

    private double[][] matrix;

    public Matrix(int rows, int cols) {
        matrix = new double[rows][cols];
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex >= this.getRows() || rowIndex < 0) {
            throw new IndexOutOfBoundsException("Неверный индекс строки!! " + rowIndex);
            //System.out.println("sds " + rowIndex);
            //return -1;
        }
        if (colIndex >= this.getColumns() || colIndex < 0) {
            throw new IndexOutOfBoundsException("Неверный индекс строоки!! " + colIndex);
            //System.out.println("ddf " + colIndex);
            //return -1;
        }
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex >= this.getRows() || rowIndex < 0) {
            throw new IndexOutOfBoundsException("Неверный индекс строки!! " + rowIndex);
            //System.out.println("sds " + rowIndex);
            // return;
        }
        if (colIndex >= this.getColumns() || colIndex < 0) {
            throw new IndexOutOfBoundsException("Неверный индекс строоки!! " + colIndex);
            //System.out.println("ddf " + colIndex);
            //return;
        }
        matrix[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("Кол-во строк не совпадает!!!");
            //System.out.println("Кол-во строк не совпадает!!!");
            //return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Кол-во колонок не совпадает!!!");
            //System.out.println("Кол-во колонок не совпадает!!!");
            //return null;
        }

        IMatrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Кол-во строк не совпадает!!!");
            return null;

        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Кол-во колонок не совпадает!!!");
            return null;
        }
        IMatrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {

    }
}
