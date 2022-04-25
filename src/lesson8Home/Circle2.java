package lesson8Home;

public class Circle2 extends FIg {
    private int firstRadius;

    public Circle2() {
    }

    public Circle2(int firstRadius) {
        this.firstRadius = firstRadius;
    }

    public int getFirstRadius() {
        return firstRadius;
    }

    public void setFirstRadius(int firstRadius) {
        this.firstRadius = firstRadius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle2 circle2 = (Circle2) o;

        return firstRadius == circle2.firstRadius;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + firstRadius;
        return result;
    }

    @Override
    public String toString() {
        return "Circle2{" +
                "firstRadius = " + firstRadius +
                ", name = " + getName()+
                ", material = " + getMaterial()+
                "} " ;
    }
}
