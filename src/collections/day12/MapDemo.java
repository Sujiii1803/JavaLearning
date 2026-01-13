package collections.day12;

import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Arun");
        students.put(102, "Priya");
        students.put(103, "Kiran");

        System.out.println("Student Map:");
        students.forEach((key, value) ->
                System.out.println(key + " -> " + value)
        );
    }
}
