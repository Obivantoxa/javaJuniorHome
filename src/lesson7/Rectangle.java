package lesson7;

public class Rectangle {
    private int ab;
    private int bc;
    private int cd;
    private int ad;
    private String color;

    public Rectangle() {
    }

    public Rectangle(int ab, int bc, int cd, int ad, String color) {
        this.ab = ab;
        this.bc = bc;
        this.cd = cd;
        this.ad = ad;
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

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
