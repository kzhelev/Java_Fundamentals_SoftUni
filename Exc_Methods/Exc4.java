package Exc_Methods;

import java.util.Scanner;

public class Exc4 {
    public static void passwordCheck(Scanner scanner) {
        String password = scanner.next();
        boolean isValid = true;
        char[] pass = new char[password.length()];
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }
        int digits = 0;
        int letters = 0;
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            pass[i] = password.charAt(i);
            if (pass[i] == 0) {
                System.out.println("Error!");
                System.out.println("Password should be one word.");
                isValid = false;
            }

            if (pass[i] >= 'A' && pass[i] <= 'Z' || pass[i] >= 'a' && pass[i] <= 'z') {
                letters ++;
                count++;
            }

            if (pass[i] >= '0' && pass[i] <= '9') {
                digits++;
                count++;
            }

            if (count != i + 1) {
                System.out.println("Password must consist only of letters and digits");
                isValid = false;
                break;
            }
        }
        if (digits < 2) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }
        if (isValid) {
            System.out.println("Password is valid");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        passwordCheck(scanner);
    }
}
