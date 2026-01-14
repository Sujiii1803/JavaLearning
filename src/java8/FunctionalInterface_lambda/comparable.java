package java8.FunctionalInterface_lambda;
import java.util.*;
class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }

}
public class comparable
{
    public static void main(String[] args)
    {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "A", 85));
        list.add(new Student(5, "B", 70));
        list.add(new Student(3, "C", 90));

        Collections.sort(list);
        System.out.println(list);
    }
}
