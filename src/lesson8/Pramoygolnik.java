package lesson8;

public class Pramoygolnik {
    private int a;
    private int b;

    public Pramoygolnik() {
    }

    public Pramoygolnik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int ploshad() {
        //this - не явный входящий параметр
        return this.a * this.b;
    }

    public int perimetr() {
        return this.a + this.a + this.b + this.b;

        //переопределение метода -
        //переписываем логику родительского метода

    }

    @Override
    public boolean equals(Object o) {
        //0- прямоуголькик 1
        //this -прям 0
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Pramoygolnik that = (Pramoygolnik) o;

        if (a != that.a) return false;
        return b == that.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }

    @Override
    public String toString() {
        return "Прямоугольник {" +
                "a = " + a +
                ", b = " + b +
                '}';
    }
}
