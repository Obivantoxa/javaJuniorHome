package lesson15;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {

        Student student1 = new Student(1,"Ivan",4);
        Student student2 = new Student(1,"Ivan",4);

        Student student3 = new Student(3,"Vika",4);
        Student student4 = new Student(4,"sika",3);

        Map<Student, Double> studentMap = new HashMap<>();

        studentMap.put( student1, 1.3);



        studentMap.putIfAbsent(student2,3.0);
        List<String> strings = new LinkedList<>();

        System.out.println(studentMap);





    }
}
