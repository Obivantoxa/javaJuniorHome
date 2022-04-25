package lesson7;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle("red", "Круг 1 ", 4);
        Circle circle2 = new Circle("Blue", "Круг 2 ", 4);
        System.out.println(circle1.getColor());
        System.out.println(circle2.getName());
        System.out.println(circle1.getSquareOfCircle() + "  Площадь круга с радуиусм " + circle1.getRadius());
        System.out.println();


        Square square = new Square("Black", 3);

        System.out.println(square.getColor() + " " + square.getSize());

        System.out.println();


        Triangle triangle = new Triangle(12, 12, 123, "Brown");

        System.out.println(triangle.getColor());


    }
}
