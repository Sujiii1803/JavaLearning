package exceptionhandling.day11;

public class MultipleCatchDemo {

    public static void main(String[] args) {

        try {
            int[] arr = new int[5];
            arr[10] = 50;   // ArrayIndexOutOfBoundsException

            int x = 10 / 0; // ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        } catch (Exception e) {
            System.out.println("Some other exception");
        }

        System.out.println("Execution finished");
    }
}
