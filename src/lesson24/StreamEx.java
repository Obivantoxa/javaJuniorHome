package lesson24;

import lesson22.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) {


        Student student = new Student(1, "Alex", "Petrov", 3, 7.5, 27);
        Student student1 = new Student(2, "Elena", "Lenina", 1, 8.1, 23);
        Student student2 = new Student(3, "Ivan", "Ivanov", 3, 9.5, 31);
        Student student3 = new Student(4, "Denis", "Sidorov", 5, 6.3, 34);
        Student student4 = new Student(5, "Inna", "Minina", 4, 9.0, 24);
        Student student5 = new Student(5, "Inna", "Minina", 4, 9.0, 24);



        student.setAdress(List.of("Lenina 21","petrova 46"));
        student1.setAdress(List.of("Lenina 123","petrova 90"));
        student2.setAdress(List.of("Lenina 123","petrova 90"));
        student3.setAdress(List.of("Lenina 232","petrova 47"));
        student4.setAdress(List.of("Lenina 2313","petrova 56"));
        student5.setAdress(List.of("Lenina 223","petrova 16"));




        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        students.stream()
                .flatMap(s->s.getAdress().stream())
                .forEach(System.out::println);
//        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4, 5);
//        Stream<Integer> integerStream = Stream.of(6,7,8,9,10);
//
//        Stream.concat(integerStream1,integerStream).forEach(System.out::println);

//        students.stream()
//                .distinct()
//                .forEach(System.out::println);
//
//
//        long count = students.stream()
//                .count();
//        System.out.println(count);

//        students.stream()
//                .distinct()
//                .peek(System.out::println)
//                .map(Student::getFirstName)
//                .forEach(System.out::println);
//        Map<Boolean, List<String>> collect = students.stream()
//                .distinct()
//                .peek(System.out::println)
//                .map(Student::getFirstName)
//                .collect(Collectors.partitioningBy(s -> ((String) s).length() > 4));
//        //.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        System.out.println(collect);


//        Map<Integer, List<Student>> collect1 = students.stream()
//                .collect(Collectors.groupingBy(Student::getCourse));
//        System.out.println("On course 1 " + collect1.get(1));
//        System.out.println("On course 2 " + collect1.get(2));
//        System.out.println("On course 3 " + collect1.get(3));
//        System.out.println("On course 4 " + collect1.get(4));
//        System.out.println("On course 5 " + collect1.get(5));

//        String collect = students.stream()
//                .map(Student::getSecondName)
//                .collect(Collectors.joining(", ","{ ", " }"));
//        System.out.println(collect);
//
//        StringJoiner stringJoiner = new StringJoiner(",","{","}");
//        stringJoiner.add(student.getFirstName());
//        stringJoiner.add(student1.getFirstName());
//        stringJoiner.add(student2.getFirstName());
//        stringJoiner.add(student3.getFirstName());
//        stringJoiner.add(student4.getFirstName());
//        stringJoiner.add(student5.getFirstName());
//        System.out.println(stringJoiner);




    }
}
