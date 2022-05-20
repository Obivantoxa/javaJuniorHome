package lesson22;

import java.sql.ClientInfoStatus;
import java.util.List;

public class Student {
    private int id;
    private String firstName;
    private String secondName;
    private int course;
    private double markAvg; //среданяя оценка
    private int age;
    private List<String> adress;

    public Student(int id, String firstName, String secondName, int course, double markAvg, int age) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.course = course;
        this.markAvg = markAvg;
        this.age = age;
    }

    public List<String> getAdress() {
        return adress;
    }

    public void setAdress(List<String> adress) {
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getMarkAvg() {
        return markAvg;
    }

    public void setMarkAvg(double markAvg) {
        this.markAvg = markAvg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", course=" + course +
                ", markAvg=" + markAvg +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (course != student.course) return false;
        if (Double.compare(student.markAvg, markAvg) != 0) return false;
        if (age != student.age) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        return secondName != null ? secondName.equals(student.secondName) : student.secondName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + course;
        temp = Double.doubleToLongBits(markAvg);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + age;
        return result;
    }
}
