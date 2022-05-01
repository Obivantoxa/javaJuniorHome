package lesson18;

public class Vedushiy {

    public static void main(String[] args) {
        System.out.println("Start concert");

        Singer1 singer1 = new Singer1();
        singer1.start();

        Singer2 singer2 = new Singer2();
        singer2.setDaemon(true);
        singer2.start();
        // недает сделть принт до того пока певцы не закончили
        while (singer1.isAlive()){
        }
        System.out.println("Finish concert");
    }
}
