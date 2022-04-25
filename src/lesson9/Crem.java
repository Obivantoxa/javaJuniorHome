package lesson9;

public class Crem extends Dobavka{


    public Crem(Baking baking) {
        super(baking);
    }

    @Override
    public long getPrice() {
        return 20 + baking.getPrice();
    }

    @Override
    public String getDiscription() {
        return baking.getDiscription() + " С кремом";
    }

    @Override
    public void about() {
        System.out.println("ss");

    }
}
