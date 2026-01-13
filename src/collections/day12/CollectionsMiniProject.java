package collections.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class CollectionsMiniProject {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        students.add(new Student(1, "Arun"));
        students.add(new Student(2, "Priya"));
        students.add(new Student(3, "Kiran"));

        System.out.println("All Students:");
        students.forEach(System.out::println);

        System.out.print("\nEnter ID to remove: ");
        int removeId = sc.nextInt();

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.id == removeId) {
                it.remove();
            }
        }

        System.out.println("\nAfter Removal:");
        students.forEach(System.out::println);

        sc.close();
    }
}
