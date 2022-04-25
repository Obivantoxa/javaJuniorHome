package lesson14;

import java.util.HashMap;

public class Fridj {

    private HashMap<String, Integer> products = new HashMap<>();

    public void putProduct(String product, int value) {
        if (products.containsKey(product)) {
            products.put(product, value + products.get(product));
        } else {
            products.put(product, value);
        }
    }
    public void printAllProducts(){
        for(String product : products.keySet()){
            System.out.println(product + " - " + products.get(product));

        }
    }

    public void getProduct(String product, int value){

        if (!products.containsKey(product)){ //если не содержится
            System.out.println("This product no" + product);
            return;
        }

        if (products.get(product) < value){
            System.out.println("we take ONLY" + products.get(product) + " kg " + product);
            products.remove(product);
            return;
        }

        products.put(product, products.get(product) -value);
        System.out.println("We get product " + product + ", " + value );
    }
}
