package oops.day4;

public class Student {

    String name;
    int rollNo;
    int marks;

    void display() {
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Suji";
        s1.rollNo = 101;
        s1.marks = 85;

        s1.display();
    }
}
