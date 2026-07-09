package InvalidAgeException;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class InvalidAgeDemo {

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = input.nextInt();

            validateAge(age);

        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid number.");
        }

        input.close();
    }
}