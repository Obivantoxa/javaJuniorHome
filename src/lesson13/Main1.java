package lesson13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {

        Coin coin1= new Coin(1800, 5, 21.1,"bronze");
        Coin coin2= new Coin(1800, 5, 21.1,"bronze");
        Coin coin3= new Coin(180, 4, 1.1,"abred");
        Coin coin4= new Coin(1992, 3, 0.1,"bfe");
        Coin coin5= new Coin(2000, 1, 2.5,"gold");

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        CoinSort.printCoinByMetall(coins);
        CoinSort.printCoinByNominal(coins);



    }
}
