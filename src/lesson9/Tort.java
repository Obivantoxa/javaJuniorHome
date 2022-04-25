package lesson9;

public class Tort implements Baking {



    @Override
    public long getPrice() {
        return 100;
    }

    @Override
    public String getDiscription() {
        return "Tort ";
    }

    @Override
    public void about() {
        System.out.println(getDiscription() + getPrice());

    }
}
