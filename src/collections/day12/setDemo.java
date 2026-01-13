package collections.day12;

import java.util.HashSet;
class SetDemo {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // duplicate

        System.out.println("Set elements:");
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
