package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> tablo = new HashMap<>();
        tablo.put("Spartak", 23);
        tablo.put("Dinamo", 25);
        tablo.put("CSKA",10);
        tablo.put("Dinamo", 11 + tablo.get("Dinamo"));

        //System.out.println(tablo);

        /** Проходы по мапе 1 вариант
         * for ( "коллецкия ключей" тип + имя  : "достаем значение по ключу"
         * for( String comanda :tablo.keySet()){
         */
        for( String comanda : tablo.keySet()){
            System.out.println(comanda + " - " + tablo.get(comanda));
        }

        /** второй способ ( более сложный с помощью keySet)
         * Map.Entry<String, Integer> + имя : (tablo.entrySet()) ( достает всю корзинку))
         *
         */
        for(Map.Entry<String, Integer>comandaBall:tablo.entrySet()){
            System.out.println(comandaBall.getKey() + " - " + comandaBall.getValue());
        }


    }
}
