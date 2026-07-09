package OutOfRangeException;

import java.util.Scanner;

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class RangeCheckDemo {

    static void checkRange(int number) throws OutOfRangeException {
        if (number < 1 || number > 100) {
            throw new OutOfRangeException("Number must be between 1 and 100.");
        }

        System.out.println("Valid number: " + number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter an integer between 1 and 100: ");
            int number = input.nextInt();

            checkRange(number);

        } catch (OutOfRangeException e) {
            System.out.println("Out of Range Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid integer.");
        }

        input.close();
    }
}