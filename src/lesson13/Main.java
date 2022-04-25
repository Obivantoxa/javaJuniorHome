package lesson13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<String> strings = new TreeSet<>();
        strings.add("qqq");
        strings.add("www");
        strings.add("dse");
        strings.add("aa");
        strings.add("e");
        strings.add("d3se");
        strings.add("bb");
        strings.add("d3se");

        // итератор (обычно если нужно удалить)

       for (Iterator<String> iter = strings.iterator() ;iter.hasNext();){
           System.out.println(iter.next());

       }

    }
}
