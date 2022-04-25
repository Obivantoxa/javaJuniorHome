package lesson14;

public class Main2 {
    public static void main(String[] args) {


        Fridj fridj = new Fridj();
        fridj.putProduct("apple", 2);
        fridj.putProduct("apple", 3);
        fridj.putProduct("chiken", 1);
        fridj.putProduct("meat", 5);

        fridj.getProduct("apple", 7);
        fridj.printAllProducts();


    }
}
