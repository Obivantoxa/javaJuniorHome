package lesson13;

import java.util.Comparator;

public class SortByMetallComparator implements Comparator<Coin> {

    @Override
    public int compare(Coin o1, Coin o2) {
        // sort po diametru, nominal,year,material

        /**
         * o1 - 1 moneta
         * 02 -2 moneta
         */

        if(!o1.getMetall().equals(o2.getMetall())) //проверка на неравенство
            return o1.getMetall().compareTo(o2.getMetall());

        if (o1.getDiametrt() != o2.getDiametrt()){
            return Double.compare(o1.getDiametrt(), o2.getDiametrt());
        }
        if(o1.getNominal() != o2.getNominal()){
            return o1.getNominal()-o2.getNominal();
        }
        if(o1.getYear()!= o2.getYear())
            return o1.getYear()-o2.getYear();

        return 0;
    }
}
