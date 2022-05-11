package lesson21;
// вложенный статический класс
public class Car {
    String model;
    String color;
    Integer maxSpeed;
    Engine engine;

    public Car(String model, String color, Integer maxSpeed, Engine engine) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engine = engine;

    }
    public void printHorsePower(){
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engine=" + engine +
                '}';
    }

    public  class Engine{
        long hoursePower;

        public Engine(long hoursePower) {

            this.hoursePower = hoursePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "hoursePower=" + hoursePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        // указать полный путь
//        Car.Engine engine = new Car.Engine(100);
//        Car car = new Car("BMW","Black",280,engine);
//
//        System.out.println(engine);
//        System.out.println(car);

    }
}