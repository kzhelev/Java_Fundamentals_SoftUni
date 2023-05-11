package StringAndStringBilder;

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i <input.length(); i++) {
            if (input.charAt(i) <= '9' && input.charAt(i) >= '0') {
                digits.append(input.charAt(i));
            } else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z'
                    || input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                letters.append(input.charAt(i));
            } else {
                others.append(input.charAt(i));
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
