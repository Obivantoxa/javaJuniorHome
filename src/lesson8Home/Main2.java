package lesson8Home;

public class Main2 {
    public static void main(String[] args) {

//        FIg fig1 = new FIg("krug", "amg3");
//        FIg fig2 = new FIg("hr", "amg2");
//
//        System.out.println(fig1.toString());
//        System.out.println(fig2.toString());
//
//        Circle2 circle1 = new Circle2(23);
//
//        System.out.println(circle1.toString());
//
//
//        circle1.setMaterial("steel");
//        circle1.setName("Steel Krug");
//        System.out.println(circle1.toString());
//        System.out.println(circle1.hashCode());
//
////        Oval oval = new Oval(12);
////        oval.setMaterial("Bronze");
////        oval.setName("Dot");
////        oval.setRadius(10);
////        System.out.println(oval.toString());

        FIg fIg = new FIg("f","gold");
        System.out.println(fIg.toString());
        Circle2 circle1 = new Circle2(10);
        circle1.setMaterial("Silver");
        circle1.setName("Shield");
        System.out.println(circle1.toString());

     }

}

