package lesson8;

public class Main {
    public static void main(String[] args) {
        Pramoygolnik pramoygolnik1 = new Pramoygolnik(3,5);
        int plPram = pramoygolnik1.ploshad();
        Pramoygolnik pramoygolnik2 = new Pramoygolnik(4,5);
        int pla = pramoygolnik1.perimetr();
        System.out.println(plPram);
        System.out.println(pla);
        int plas = pramoygolnik1.perimetr();

        System.out.println(plas);
        System.out.println(pramoygolnik1.equals(pramoygolnik2));

        System.out.println(pramoygolnik1.hashCode());
        System.out.println(pramoygolnik1.hashCode());

        System.out.println(pramoygolnik2.hashCode());

        System.out.println(pramoygolnik1.toString());

        /*
        1- нам нужно создать типы:
        овал,круг,прямоугольник,квадрат.
        фигура
            название
            материал
                    - круг
                        радиус
                        гет сет
                        хешкод и тд
                                    -овал
                                        (второй радиус)
                                        гет сет
                                        хешкод и тд


         */



    }
}
