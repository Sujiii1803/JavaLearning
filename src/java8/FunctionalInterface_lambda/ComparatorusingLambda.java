package java8.FunctionalInterface_lambda;
import java.util.*;
class Students {
    int id;
    String name;
    int marks;

    Students(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}
public class ComparatorusingLambda {

    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students(1, "Charlie", 85));
        list.add(new Students(2, "Alice", 70));
        list.add(new Students(3, "Bob", 90));
        list.add(new Students(4, "David", 85));


        // 1 Sort by name (alphabetical)
        Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("\nSorted by name:");
        System.out.println(list);

        // 2️ Sort by marks (ascending)
        Collections.sort(list, (s1, s2) -> s1.marks - s2.marks);
        System.out.println("\nSorted by marks (ascending):");
        System.out.println(list);

        // 3️ Sort by marks descending, if same marks then name ascending
        Collections.sort(list, (s1, s2) -> {
            if (s2.marks != s1.marks) {
                return s2.marks - s1.marks; // descending marks
            } else {
                return s1.name.compareTo(s2.name); // ascending name
            }
        });
        System.out.println("\nSorted by marks descending, then name ascending:");
        System.out.println(list);
    }
}
