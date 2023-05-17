package Exc_Methods;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int[] array = new int[x];
        for (int i = 1; i < x; i++) {
            array[i] = i;
        }
        for (int i = 0; i < x; i++) {
            char[] arrChar = new char[String.valueOf(array[i]).length()];
            for (int j = 0; j < String.valueOf(array[i]).length(); j++) {
                arrChar[j] = String.valueOf(array[i]).charAt(j);
                count += Character.getNumericValue(arrChar[j]);
            }
            if (count % 8 != 0) {
                array[i] = 0;
            }
            count = 0;
        }
        for (int i = 0; i < x; i++) {
            char[] arrChar = new char[String.valueOf(array[i]).length()];
            for (int j = 0; j < String.valueOf(array[i]).length(); j++) {
                arrChar[j] = String.valueOf(array[i]).charAt(j);
                if (arrChar[j] % 2 != 0) {

                } else {
                    array[i] = 0;
                }
            }
        }
        for (int i = 0; i < x; i++) {
            if (array[i] != 0) {
                System.out.println(array[i]);
            }
        }
    }
}






       /* Scanner scanner = new Scanner(System.in);
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

            if (pass[i] >= '1' && pass[i] <= '9') {
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

*/

