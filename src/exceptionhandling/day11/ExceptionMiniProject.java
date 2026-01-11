package exceptionhandling.day11;

import java.util.Scanner;

public class ExceptionMiniProject {

    static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above");
        }
        System.out.println("Access granted");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            validateAge(age);

        } catch (CustomException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Age verification completed");
        }

        sc.close();
    }
}
