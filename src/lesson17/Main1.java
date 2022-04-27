package lesson17;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(221);
        } catch (UncurrentAgeExeption e) {
            e.printStackTrace();
        }
        System.out.println("!!!");
    }
}
