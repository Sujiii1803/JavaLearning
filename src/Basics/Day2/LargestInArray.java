package Basics.Day2;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 20, 8};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest = " + max);
    }

    public static class WhileLoopDemo {
        public static void main(String[] args) {
            int i = 1;

            while (i <= 5) {
                System.out.println(i);
                i++;
            }
        }
    }
}