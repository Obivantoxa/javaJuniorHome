package lesson7;

public class Triangle {
    private int ab;
    private int bc;
    private int ac;
    private String color;

    public Triangle() {
    }

    public Triangle(int ab, int bc, int ac, String color) {
        this.ab = ab;
        this.bc = bc;
        this.ac = ac;
        this.color = color;
    }

    public int getAb() {
        return ab;
    }

    public void setAb(int ab) {
        this.ab = ab;
    }

    public int getBc() {
        return bc;
    }

    public void setBc(int bc) {
        this.bc = bc;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
