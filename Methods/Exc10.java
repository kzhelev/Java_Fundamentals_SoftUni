package Methods;

import java.util.Scanner;

public class Exc10 {

    public static int counter(Scanner scanner) {
        int even = 0;
        int odd = 0;
        String string = scanner.nextLine().trim();
        if (string.charAt(0) == '-' || string.charAt(0) == '+') {
            for (int i = 1; i < string.length(); i++) {
                if (Character.getNumericValue(string.charAt(i)) % 2 == 0) {
                    even += Character.getNumericValue(string.charAt(i));
                } else {
                    odd += Character.getNumericValue(string.charAt(i));
                }
            }
            return (even*odd);
        } else {
            for (int i = 0; i < string.length(); i++) {
                if (Character.getNumericValue(string.charAt(i)) % 2 == 0) {
                    even += Character.getNumericValue(string.charAt(i));
                } else {
                    odd += Character.getNumericValue(string.charAt(i));
                }
            }
        }
        return (even*odd);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(counter(scanner));
    }
}
