package Exc_Methods;

import java.util.Scanner;

public class Exc2 {
    public static void vowelsNumbers(Scanner scanner) {
        int counter = 0;
        String string = scanner.nextLine().toLowerCase();
        char[] arr = new char[string.length()];
        for (int j = 0; j < string.length(); j++) {
            arr[j] = string.charAt(j);
            if (arr[j] == 'a' || arr[j] == 'o'  || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'u' ) {
                counter++;
            }
        }
        System.out.println(counter);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vowelsNumbers(scanner);
    }
}
