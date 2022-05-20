package lesson23;

import lesson22.Student;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionEx {


    public static void map(List<Student> students,Function<Student,String> function){
        for (Student student : students) {
            System.out.println(function.apply(student));

        }
    }

    public static void main(String[] args) {

        Student student = new Student(1, "Alex", "Petrov", 3, 7.5, 27);
        Student student1 = new Student(2, "Elena", "Lenina", 1, 8.1, 23);
        Student student2 = new Student(3, "Ivan", "Ivanov", 3, 9.5, 31);
        Student student3 = new Student(4, "Denis", "Sidorov", 5, 6.3, 34);
        Student student4 = new Student(5, "Inna", "Minina", 4, 9.0, 24);
        Student student5 = new Student(6, "Inna", "Krylov", 1, 7.0, 24);

        List<Student>students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        //map(students, s ->s.getFirstName());
//        students.stream().filter(new Predicate<Student>() {
//            @Override
//            public boolean test(Student student) {
//                return student.getFirstName().equals("Inna");
//            }
//        });
        //students.stream().filter(s ->s.getCourse() > 2).forEach(s -> System.out.println(s));
//        students
//                .stream()
//                .filter(s->s.getMarkAvg()>8.0)
//                .forEach(s->{
//                    s.setFirstName("Best "+ s.getFirstName());
//                    System.out.println(s);
//                });

//        students
//                .stream()
//                .filter(s->s.getAge() > 25)
//                .map(s->s.getCourse())
//                .forEach(course -> System.out.println(course));
         students
                .stream()
                .filter(s -> s.getAge() > 25)
                .map(s -> s.getCourse())
                .reduce((acc, i) -> acc + i)
                .ifPresent(i -> System.out.println(i));

        //if (reduce.isPresent()) System.out.println(reduce);
        //reduce.orElseThrow(()-> new NoSuchElementException());
        //Integer integer = reduce.orElseGet(() -> 0);
        //reduce.ifPresent(i -> System.out.println(i));

//        Integer reduce = students
//                .stream()
//                .filter(s -> s.getAge() > 25)
//                .map(s -> s.getCourse())
//                .reduce(10, (acc, i) -> acc + i);
//        //.ifPresent(i -> System.out.println(i));
//
//        System.out.println(reduce);

//        students.stream()
//                .sorted((s1,s2) -> s1.getFirstName().compareTo(s2.getFirstName()))
//                .forEach(s -> System.out.println(s));

//        students.stream()
//                .sorted(Comparator
//                        .comparing(Student::getFirstName)
//                        .thenComparing(Student::getAge)
//                        .thenComparing(Student::getCourse)
//                                .reversed())


                //.sorted((s1,s2) -> s1.getFirstName().compareTo(s2.getFirstName()))
//                .forEach(System.out::println);

      //  Stream.of("sd")

//        String[] strings = new String{"Hello", "World"};
//        Arrays.stream(strings).map(s->s.length())


    }
}
