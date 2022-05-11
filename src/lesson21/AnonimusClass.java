package lesson21;

import java.util.ArrayList;
import java.util.List;

public class AnonimusClass {
    public static void print(List<String> strings, A a){
        for (String string : strings) {
            if (a.test(string)) System.out.println(string);

        }

    }
    public static void main(String[] args) {

        List<String> string = List.of("Flor","Fix","Car","Model");
        print(string, new A() { // создали анонимный класс
            @Override
            public boolean test(String s) {
                return s.startsWith("M");//
            }
        });
    }
}

interface A{
    boolean test (String s);

}
class B implements A{
    public boolean test (String s){
        return s.startsWith("C");

    }

}
