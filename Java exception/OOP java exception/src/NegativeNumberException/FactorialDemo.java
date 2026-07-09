package NegativeNumberException;

import java.util.Scanner;
import java.math.BigInteger;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class FactorialDemo {

    static BigInteger factorial(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }

        if (number == 0 || number == 1) {
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(number).multiply(factorial(number - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a non-negative integer: ");
            int number = input.nextInt();

            BigInteger result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);

        } catch (NegativeNumberException e) {
            System.out.println("Negative Number Error: " + e.getMessage());
        } catch (StackOverflowError e) {
            System.out.println("Error: Number is too large. Recursion caused stack overflow.");
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid integer.");
        }

        input.close();
    }
}