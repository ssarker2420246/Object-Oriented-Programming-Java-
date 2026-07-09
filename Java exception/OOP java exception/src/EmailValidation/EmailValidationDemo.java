package EmailValidation;

import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class EmailValidationDemo {

    static void validateEmail(String email) throws InvalidEmailException {
        int atCount = 0;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                atCount++;
            }
        }

        if (atCount != 1) {
            throw new InvalidEmailException("Email must contain exactly one '@' symbol.");
        }

        String[] parts = email.split("@");

        if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty()) {
            throw new InvalidEmailException("Username and domain cannot be empty.");
        }

        String username = parts[0];
        String domain = parts[1];

        if (username.contains(" ") || domain.contains(" ")) {
            throw new InvalidEmailException("Email must not contain spaces.");
        }

        if (!domain.contains(".")) {
            throw new InvalidEmailException("Domain must contain at least one '.' symbol.");
        }

        System.out.println("Valid email address: " + email);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter email address: ");
            String email = input.nextLine();

            validateEmail(email);

        } catch (InvalidEmailException e) {
            System.out.println("Invalid Email Error: " + e.getMessage());
        }

        input.close();
    }
}