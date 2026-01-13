package collections.day12;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Arun");
        names.add("Priya");
        names.add("Kiran");

        System.out.println("Names List:");
        for (String name : names) {
            System.out.println(name);
        }

        names.remove("Priya");

        System.out.println("\nAfter Removal:");
        System.out.println(names);
    }
}
