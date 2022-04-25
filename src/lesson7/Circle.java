package lesson7;

public class Circle {
    // п
    private String name;
    private String color;
    private int radius;
    private double squareOfCircle;

    public Circle() {
    }

    public Circle(String name, String color, int radius) {
        this.name = name;
        this.color = color;
        this.radius = radius;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public double getSquareOfCircle() {
        this.squareOfCircle = (this.radius)*(this.radius)*3.14;
        return squareOfCircle;
    }
}
