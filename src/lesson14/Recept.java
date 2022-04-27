package lesson14;

import java.util.HashMap;

public class Recept {

    private String name;
    private HashMap<String,Integer> ingr = new HashMap<>();

    public Recept() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> getIngr() {
        return ingr;
    }

    public void setIngr(HashMap<String, Integer> ingr) {
        this.ingr = ingr;
    }
    /**
     * сделать клас так чтобы мы могли с майна создать рецепт и добавить туда ингридиеты
     *boolean.canCook = fridj.canCook(Recept) в мейне и отадает нам да или нет проверка рецепта по холодильнику
     */


}
