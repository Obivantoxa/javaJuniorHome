package lesson9;

public class TestTort {
    public static void main(String[] args) {

        Baking baking = new Tort();
        baking.about();

        Dobavka dobavka = new Crem(baking);
        dobavka.about();

        baking = new Crem(baking);
        baking.about();

        baking=new Chocolate(baking);
        baking.about();



    }
}
