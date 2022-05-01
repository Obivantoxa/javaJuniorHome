package lesson13;

import java.util.ArrayList;
import java.util.HashSet;

public class Main2  {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        HashSet<Integer> b = new HashSet<>();
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);

        CollectionUtilsImps utills = new CollectionUtilsImps();

        System.out.println(utills.union(a,b));
        System.out.println(utills.intersection(a,b));


    }
}
