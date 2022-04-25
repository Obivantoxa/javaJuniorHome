package lesson15;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedClass {

    public static void main(String[] args) {
        Example<Integer> stringExample = new Example<>();

        List<?> objects = new ArrayList<String>();
    }
}

class Example<T>{
   T value;



   public void showValue(){

       System.out.println(value);
   }

   public <V> void printElementCollection(List<V> values){
       for (V v : values) {
           System.out.println(v);

       }
   }
}