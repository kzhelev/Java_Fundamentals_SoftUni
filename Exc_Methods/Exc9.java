package Exc_Methods;

import java.util.Scanner;

public class Exc9 {
    public static void palindromeIntegers(Scanner scanner) {
        String string = scanner.nextLine();

        while(!"END".equals(string)) {
            StringBuffer input = new StringBuffer(string);
            String newString = input.reverse().toString();
            if (string.equals(newString)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            string = scanner.nextLine();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        palindromeIntegers(scanner);
    }
}
