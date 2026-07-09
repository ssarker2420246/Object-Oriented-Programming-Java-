package InvalidParameterException;

import java.util.Scanner;
import java.security.InvalidParameterException;

public class SumWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            if (num1 < 0 || num2 < 0) {
                throw new InvalidParameterException("Negative numbers are not allowed.");
            }

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);

        } catch (InvalidParameterException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers.");
        }

        input.close();
    }
}